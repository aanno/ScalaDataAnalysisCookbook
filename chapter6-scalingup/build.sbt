organization := "com.packt"

name := "chapter6-scalingup"

scalaVersion := "2.12.8"
val sparkVersion="2.4.0"

libraryDependencies  ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion % "provided",
  "org.apache.spark" %% "spark-sql" % sparkVersion % "provided",
  "org.apache.spark" %% "spark-mllib" % sparkVersion % "provided",
  "com.databricks" %% "spark-csv" % "1.5.0",
  "org.apache.hadoop"  % "hadoop-client" % "3.2.0",
  ("org.scalanlp" %% "epic-parser-en-span" % "2016.8.29").
    exclude("xml-apis", "xml-apis")
)

assemblyJarName in assembly := "scalada-learning-assembly.jar"

assemblyOption in assembly := (assemblyOption in assembly).value.copy(includeScala = false)

assemblyMergeStrategy in assembly := {
  case "application.conf"                            => MergeStrategy.concat
  case PathList("org", "cyberneko", "html", xs @ _*) => MergeStrategy.first
  case m if m.toLowerCase.endsWith("manifest.mf")    => MergeStrategy.discard
  case f                                             => (assemblyMergeStrategy in assembly).value(f)
}

