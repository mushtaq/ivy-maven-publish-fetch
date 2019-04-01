package bug

import java.io.File

import coursier._
import coursier.maven.MavenRepository
import coursier.util.Task.sync

object Main extends App {

  private val Home = System.getProperty("user.home")

  val files: Seq[File] = Fetch()
    .addDependencies(dep"com.thoughtworks::top:0.1.0-SNAPSHOT:test")
    .addRepositories(MavenRepository(s"file://$Home/.m2/repository"))
    .run()

  files.foreach(println)
}
