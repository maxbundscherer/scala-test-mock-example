name := "scala-test-mock-example"
version := "0.1"
scalaVersion := "2.12.3"

val scalaTestVersion: String  = "3.0.1"

//ScalaTest
libraryDependencies ++= Seq(
  "org.scalactic" %% "scalactic" % scalaTestVersion,
  "org.scalatest" %% "scalatest" % scalaTestVersion % "test"
)