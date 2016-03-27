lazy val root = (project in file(".")).
  settings(
    name := baseDirectory.value.getName,
    version := "1.0",
    scalaVersion := "2.11.7",
    hello := { println("Hello 77!") },
    libraryDependencies += "org.apache.derby" % "derby" % "10.4.1.3",
    libraryDependencies += "org.specs2" %% "specs2-core" % "3.7" % "test",
    libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.0-M15",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.0-M15" % "test",
    libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.13.0" % "test",
    libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.4.1",
    resolvers += Resolver.mavenLocal
  )

lazy val hello = taskKey[Unit]("An example task")

site.settings



