organization := "com.packt"

name := "chapter4-visualization"

scalaVersion := "2.12.8"
val breezeVersion = "1.0-RC2"
val sparkVersion="2.4.0"

libraryDependencies  ++= Seq(
  "org.scalanlp" %% "breeze" % breezeVersion,
  "org.scalanlp" %% "breeze-natives" % breezeVersion,
  "org.scalanlp" %% "breeze-viz" % breezeVersion,
  "io.continuum.bokeh" %% "bokeh" % "0.7",
  "joda-time" % "joda-time" % "2.10.1",
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion,
  "org.apache.spark" %% "spark-mllib" % sparkVersion,
  "com.databricks" %% "spark-csv" % "1.5.0"
)
