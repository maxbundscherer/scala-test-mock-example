name := "scala-test-mock-example"
version := "0.1"
scalaVersion := "2.12.3"

val scalaMockVersion: String  = "3.6.0"

//ScalaMock
libraryDependencies += "org.scalamock" %% "scalamock-scalatest-support" % scalaMockVersion % Test