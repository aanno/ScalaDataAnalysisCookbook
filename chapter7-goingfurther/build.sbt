organization := "com.packt"

name := "chapter7-goingfurther"

scalaVersion := "2.12.8"
val sparkVersion="2.4.0"

libraryDependencies  ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion % "provided",
  "org.apache.spark" %% "spark-sql" % sparkVersion % "provided",
  "org.apache.spark" %% "spark-mllib" % sparkVersion % "provided",
  "org.apache.spark" %% "spark-streaming" % sparkVersion % "provided",
  "org.apache.spark" %% "spark-streaming-twitter" % sparkVersion,
  "joda-time" % "joda-time" % "2.10.1",
  "org.elasticsearch" %% "elasticsearch-spark" % "2.4.5",
  "org.apache.spark" %% "spark-streaming-kafka" % sparkVersion,
  "com.twitter" %% "chill" % "0.9.3"
)

fork := true
