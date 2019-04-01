ThisBuild / scalaVersion := "2.12.8"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.thoughtworks"
ThisBuild / organizationName := "thoughtworks"
ThisBuild / publishArtifact in (Test, packageBin) := true

lazy val top = project
  .dependsOn(common % "compile->compile;test->test")
  .settings(
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-actor" % "2.5.21",
      "com.fasterxml.jackson.core" % "jackson-databind" % "2.9.8" % Test
    )
  )

lazy val common = project
  .settings(
    libraryDependencies ++= Seq(
      "io.reactivex.rxjava2" % "rxjava" % "2.2.8",
      "junit" % "junit" % "4.12" % Test
    )
  )

lazy val bug = project
  .settings(
    libraryDependencies ++= Seq(
      "io.get-coursier" %% "coursier" % "1.1.0-M13-2",
      "io.get-coursier" %% "coursier-cache" % "1.1.0-M13-2",
    )
  )
