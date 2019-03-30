organization := "com.packt"

name := "chapter7-goingfurther"

scalaVersion := "2.12.8"
val sparkVersion="2.4.0"

libraryDependencies  ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion % "provided",
  "org.apache.spark" %% "spark-sql" % sparkVersion % "provided",
  "org.apache.spark" %% "spark-mllib" % sparkVersion % "provided",
  "org.apache.spark" %% "spark-streaming" % sparkVersion % "provided",
  // "org.apache.bahir" %% "spark-streaming-twitter" % (sparkVersion + "-SNAPSHOT"),
  "org.apache.bahir" %% "spark-streaming-twitter" % "2.3.2",
  "joda-time" % "joda-time" % "2.10.1",
  "org.elasticsearch" %% "elasticsearch-spark-20" % "6.6.2",
  "org.apache.spark" %% "spark-streaming-kafka-0-10" % sparkVersion,
  "com.twitter" %% "chill" % "0.9.3"
)

fork := true
