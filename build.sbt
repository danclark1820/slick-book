name := "slick-book"

version := "0.13.5"

scalaVersion := "2.10.3"

libraryDependencies ++= Seq(
    "postgresql" % "postgresql" % "9.1-901.jdbc4",
    "com.typesafe.slick" %% "slick" % "2.1.0"
)
