name := "scala-test-mock-example"
version := "0.1"
scalaVersion := "2.12.3"

val scalaTestVersion: String  = "3.0.1"
val scalaMockVersion: String  = "3.6.0"

//ScalaTest
libraryDependencies ++= Seq(
  "org.scalactic" %% "scalactic" % scalaTestVersion,
  "org.scalatest" %% "scalatest" % scalaTestVersion % "test"
)

//ScalaMock
libraryDependencies += "org.scalamock" %% "scalamock-scalatest-support" % scalaMockVersion % Test