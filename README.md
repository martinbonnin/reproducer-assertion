To reproduce:

```
$ ./gradlew :module2:compileKotlinMetadata --rerun-tasks 

> Task :module2:compileKotlinMetadata FAILED
e: warnings found and -Werror specified
w: file:///Users/mbonnin/git/reproducer-assertion/module2/src/commonMain/kotlin/module2/Main.kt:8:30 Unnecessary non-null assertion (!!) on a non-null receiver of type Data

FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':module2:compileKotlinMetadata'.
> A failure occurred while executing org.jetbrains.kotlin.compilerRunner.GradleCompilerRunnerWithWorkers$GradleKotlinCompilerWorkAction
   > Compilation error. See log for more details
```
