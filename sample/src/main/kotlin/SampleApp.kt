import io.github.oshai.kotlinlogging.KotlinLogging

fun main(world: String) {
  val log = KotlinLogging.logger {}
  log.info { "Hello, $world!" }
}
