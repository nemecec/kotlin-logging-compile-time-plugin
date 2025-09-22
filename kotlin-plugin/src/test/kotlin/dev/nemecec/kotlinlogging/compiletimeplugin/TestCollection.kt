package dev.nemecec.kotlinlogging.compiletimeplugin

import org.junit.jupiter.api.DynamicContainer
import org.junit.jupiter.api.DynamicTest

data class TestCollection<T : TestLeaf>(
  val label: String,
  val filename: String,
  private val childCollections: List<TestCollection<T>> = emptyList(),
  private val tests: List<T> = emptyList(),
  private var expectationAdjustersPerTest: List<FeatureFlagExpectationAdjuster> = emptyList(),
) {

  fun cloneWithNewName(
    newLabel: String,
    newFilename: String,
    mapper: (T) -> T = { it },
  ): TestCollection<T> {
    return TestCollection(
      newLabel,
      newFilename,
      childCollections.map { it.map(mapper) },
      tests.map { mapper(it) },
      expectationAdjustersPerTest,
    )
  }

  fun <TT : TestLeaf> map(mapper: (T) -> TT): TestCollection<TT> {
    return TestCollection(
      label,
      filename,
      childCollections.map { it.map(mapper) },
      tests.map { mapper(it) },
      expectationAdjustersPerTest,
    )
  }

  fun <TT : TestLeaf> mapWithExpectationAdjusters(
    featureFlag: FeatureFlag,
    parentExpectationAdjusters: List<TestExecutionResultBuilder.() -> Unit>,
    mapper: (List<TestExecutionResultBuilder.() -> Unit>, T) -> TT,
  ): TestCollection<TT> {
    val expectationAdjusters =
      parentExpectationAdjusters +
        expectationAdjustersPerTest
          .filter { it.applicableFeatureFlags.contains(featureFlag) }
          .map { it.expectationAdjuster }
    return TestCollection(
      label,
      filename,
      childCollections.map {
        it.mapWithExpectationAdjusters(featureFlag, expectationAdjusters, mapper)
      },
      tests.map { mapper(expectationAdjusters, it) },
      expectationAdjustersPerTest,
    )
  }

  fun forEach(
    indent: String = "",
    collectionVisitor: (indent: String, TestCollection<T>) -> Unit,
    testVisitor: (indent: String, T) -> Unit,
  ) {
    collectionVisitor(indent, this)
    tests.forEach { testVisitor(indent, it) }
    childCollections.forEach { it.forEach("  $indent", collectionVisitor, testVisitor) }
  }

  fun <M> flatMapAndExtract(mapper: (T) -> M): List<M> {
    return childCollections.flatMap { it.flatMapAndExtract(mapper) } + tests.map(mapper)
  }

  fun toDynamicTests(testMaker: T.() -> DynamicTest): DynamicContainer {
    val children =
      childCollections.map { it.toDynamicTests(testMaker) } +
        tests.filter { !it.skip }.map { it.testMaker() }
    return DynamicContainer.dynamicContainer(label, children)
  }

  fun toMarkDown(
    parent: MarkDownDocument,
    writer: (MarkDownDocument, String) -> Unit,
  ): MarkDownDocument {
    val thisDoc = parent.newChild(filename, label, childCollections.isNotEmpty())
    val childDocuments = childCollections.map { it.toMarkDown(thisDoc, writer) }
    val contents =
      """
      |## ${thisDoc.titleWithParents}
      |
      |${childDocuments.joinToString(separator = "\n") { "* ${it.getLinkFromParentPerspective()}" }}
      |
      |${tests.filter { !it.skip }.joinToString(separator = "\n\n") { it.toMarkDownDocument() }}
      |"""
        .trimMargin()
    writer.invoke(thisDoc, contents)
    return thisDoc
  }
}

interface TestLeaf {
  val skip: Boolean

  fun toMarkDownDocument(): String {
    TODO("Not implemented")
  }
}

fun rootCollection(init: TestCollectionBuilder.() -> Unit) =
  TestCollectionBuilder().apply(init).build()

class TestCollectionBuilder {
  var label: String? = null
  var filename: String? = null
  private var childCollections: MutableList<TestCollection<TestDefinition>> = mutableListOf()
  private var tests: MutableList<TestDefinition> = mutableListOf()
  private var expectationAdjustersPerTest: MutableList<FeatureFlagExpectationAdjuster> =
    mutableListOf()

  fun collection(init: TestCollectionBuilder.() -> Unit) {
    val element = TestCollectionBuilder().apply(init).build()
    childCollections.add(element)
  }

  fun test(init: TestDefinitionBuilder.() -> Unit) {
    tests.add(TestDefinitionBuilder().apply(init).build())
  }

  fun featureFlagExpectationAdjuster(init: FeatureFlagExpectationAdjusterBuilder.() -> Unit) {
    expectationAdjustersPerTest.add(FeatureFlagExpectationAdjusterBuilder().apply(init).build())
  }

  fun build() =
    TestCollection(label!!, filename!!, childCollections, tests, expectationAdjustersPerTest)
}
