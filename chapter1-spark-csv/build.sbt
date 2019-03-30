organization := "com.packt"

name := "chapter1-spark-csv"

scalaVersion := "2.12.8"
val sparkVersion="2.4.0"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion,
  "org.apache.spark" %% "spark-mllib" % sparkVersion
  // not for spark 2.x!
  // "com.databricks" %% "spark-csv" % "1.5.0"
)

resolvers ++= Seq(
  "Apache HBase" at "https://repository.apache.org/content/repositories/releases",
  "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"
)

fork := true
