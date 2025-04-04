---
name: Bug report
about: Create a report to help us improve
title: Error message + sample of the problematic log statement
labels: ''
assignees: nemecec

---

**Debug information**

In case compiler plugin encounters an error, it will print out a lot of useful debug information. Please copy-paste it here. 

The error output looks something like this:
```
Kotlin-logging IR plugin failed.
Please report to https://github.com/nemecec/kotlin-logging-compile-time-plugin/issues and include the below information.
### Start of debug information ###
...
### End of debug information ###
```

Make sure to include all the information contained between the lines `### Start of debug information ###` and `### End of debug information ###`.

Please note that the debug information also includes the problematic log statement -- please review that to make sure you are not revealing important internal details about your system. Feel free to remove/obfuscate text in the log statement but do not change the structure of the statement (variable placeholders, special characters, etc).
