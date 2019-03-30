organization := "com.packt"

name := "chapter3-data-loading"

scalaVersion := "2.12.8"

val sparkVersion="2.4.0"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion,
  "org.apache.spark" %% "spark-mllib" % sparkVersion,
  "com.datastax.spark" %% "spark-cassandra-connector-java" % "1.5.2",
  "mysql" % "mysql-connector-java" % "8.0.15",
  // not for spark 2.x!
  // "com.databricks" %% "spark-csv" % "1.5.0"
  "org.json4s" %% "json4s-core" % "3.6.5",
  "org.json4s" %% "json4s-jackson" % "3.6.5"
  
)

resolvers ++= Seq(
  "Apache HBase" at "https://repository.apache.org/content/repositories/releases",
  "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"
)

fork := true
