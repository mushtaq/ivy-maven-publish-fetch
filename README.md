*Coursier Fetch behaves differently while resolving test artifacts from Ivy vs Maven repo*

### Steps to reproduce

**Local Ivy Repo**

- sbt publishLocal
- sbt bug/run

produces the correct output as:

```txt
/Users/mushtaq/.ivy2/local/com.thoughtworks/top_2.12/0.1.0-SNAPSHOT/jars/top_2.12.jar
/Users/mushtaq/.ivy2/local/com.thoughtworks/top_2.12/0.1.0-SNAPSHOT/jars/top_2.12-tests.jar
/Users/mushtaq/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/reactivex/rxjava2/rxjava/2.2.8/rxjava-2.2.8.jar
/Users/mushtaq/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.12.8/scala-library-2.12.8.jar
/Users/mushtaq/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/reactivestreams/reactive-streams/1.0.2/reactive-streams-1.0.2.jar
/Users/mushtaq/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar
/Users/mushtaq/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/config/1.3.3/config-1.3.3.jar
/Users/mushtaq/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/modules/scala-java8-compat_2.12/0.8.0/scala-java8-compat_2.12-0.8.0.jar
/Users/mushtaq/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/akka/akka-actor_2.12/2.5.21/akka-actor_2.12-2.5.21.jar
/Users/mushtaq/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-core/2.9.8/jackson-core-2.9.8.jar
/Users/mushtaq/.ivy2/local/com.thoughtworks/common_2.12/0.1.0-SNAPSHOT/jars/common_2.12.jar
/Users/mushtaq/.ivy2/local/com.thoughtworks/common_2.12/0.1.0-SNAPSHOT/jars/common_2.12-tests.jar
/Users/mushtaq/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-annotations/2.9.0/jackson-annotations-2.9.0.jar
/Users/mushtaq/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-databind/2.9.8/jackson-databind-2.9.8.jar
/Users/mushtaq/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/junit/junit/4.12/junit-4.12.jar
```

**Local Maven Repo**

- rm -r ~/.ivy2/local/com.thoughtworks
- sbt publishM2
- sbt bug/run

produces a single line output as:

```txt
/Users/mushtaq/.m2/repository/com/thoughtworks/top_2.12/0.1.0-SNAPSHOT/top_2.12-0.1.0-SNAPSHOT.jar
```
