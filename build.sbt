name := "barbara"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies  ++= Seq(
  "org.slf4j" % "slf4j-log4j12" % "1.7.21",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.4.0",

  "org.scalanlp" %% "breeze" % "0.12",
  "org.scalanlp" %% "breeze-natives" % "0.12",

  "com.storm-enroute" %% "scalameter" % "0.7"
  
)

resolvers += "Sonatype OSS Snapshots" at
  "https://oss.sonatype.org/content/repositories/releases" 

testFrameworks += new TestFramework("org.scalameter.ScalaMeterFramework")

parallelExecution in Test := false

fork in run := true

