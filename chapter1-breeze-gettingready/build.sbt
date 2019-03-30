organization := "com.packt"

name := "chapter1-breeze"

scalaVersion := "2.12.8"

libraryDependencies  ++= Seq(
  "org.scalanlp" %% "breeze" % "1.0-RC2",
  //Optional - the 'why' is explained in the How it works section
  "org.scalanlp" %% "breeze-natives" % "1.0-RC2"
)
