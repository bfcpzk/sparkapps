name := "Spark Example Applications"

version := "1.0"

scalaVersion := "2.10.4"

libraryDependencies += "org.apache.spark" %% "spark-core" % "1.4.1"

libraryDependencies +=  "org.scalatest" % "scalatest_2.10.0-M4" % "1.9-2.10.0-M4-B1"

libraryDependencies +=  "junit" % "junit" % "4.8.1" % "test"

libraryDependencies +=  "org.datasyslab" % "geospark" % "0.8.0-spark-1.x"

libraryDependencies += "org.apache.spark" %% "spark-mllib" % "1.4.1"

libraryDependencies += "org.apache.spark" %% "spark-sql" % "1.4.1"

libraryDependencies += "org.apache.spark" %% "spark-streaming" % "1.4.0"

libraryDependencies += "org.apache.spark" %% "spark-streaming-twitter" % "1.4.0"

libraryDependencies += "com.google.code.gson" % "gson" % "2.3"

libraryDependencies += "gov.nasa.gsfc.heasarc" % "nom-tam-fits" % "1.15.2"

resolvers += "Akka Repository" at "http://repo.akka.io/releases/"
