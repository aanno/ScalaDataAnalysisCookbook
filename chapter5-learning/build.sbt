organization := "com.packt"

name := "chapter4-learning"

scalaVersion := "2.12.8"
val sparkVersion="2.4.0"

libraryDependencies  ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion,
  "org.apache.spark" %% "spark-mllib" % sparkVersion,
  // not for spark 2.x!
  // "com.databricks" %% "spark-csv" % "1.5.0"
  "org.scalanlp" %% "epic" % "0.4.5",
  "org.scalanlp" %% "epic-parser-en-span" % "2015.2.19",
  "edu.stanford.nlp" % "stanford-corenlp" % "3.9.2",
  "edu.stanford.nlp" % "stanford-corenlp" % "3.9.2" classifier "models"
)

fork := true
