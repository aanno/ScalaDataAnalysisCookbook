organization := "com.packt"

name := "chapter3-data-loading-parquet"

scalaVersion := "2.12.8"

val sparkVersion="2.4.0"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion,
  "org.apache.spark" %% "spark-mllib" % sparkVersion,
  "org.apache.spark" %% "spark-hive" % sparkVersion,
  "org.apache.avro" % "avro" % "1.8.2",
  "org.apache.parquet" % "parquet-avro" % "1.10.1",
  "com.twitter" %% "chill-avro" % "0.9.3"
)

resolvers ++= Seq(
  "Apache HBase" at "https://repository.apache.org/content/repositories/releases",
  "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/",
  "Twitter" at "http://maven.twttr.com/"
)

fork := true

// TODO
// seq( sbtavro.SbtAvro.avroSettings : _*)
// (stringType in avroConfig) := "String"
// javaSource in sbtavro.SbtAvro.avroConfig <<= (sourceDirectory in Compile)(_ / "java")
