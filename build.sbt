name := "barbara"

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies  ++= Seq(
  "log4j" % "log4j" % "1.2.14",

  "org.scalanlp" %% "breeze" % "0.12",
  "org.scalanlp" %% "breeze-natives" % "0.12",

  "com.storm-enroute" %% "scalameter" % "0.7"
  
)

resolvers += "Sonatype OSS Snapshots" at
  "https://oss.sonatype.org/content/repositories/releases" 

testFrameworks += new TestFramework("org.scalameter.ScalaMeterFramework")

parallelExecution in Test := false
