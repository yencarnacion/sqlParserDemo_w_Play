name := "planillapr"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache
)     

libraryDependencies += "org.antlr" % "antlr4" % "4.2.2"

play.Project.playScalaSettings
