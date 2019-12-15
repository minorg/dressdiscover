name := """core-service"""
organization := "org.dressdiscover.cms"
val projectName = "cms"
version      := "1.0.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.10"

libraryDependencies ++= Seq(
  filters,
  guice,
  "org.sangria-graphql" %% "sangria" % "1.4.2",
  "org.sangria-graphql" %% "sangria-slowlog" % "0.1.8",
  "org.sangria-graphql" %% "sangria-play-json" % "1.0.4",
  "org.scalatestplus.play" %% "scalatestplus-play" % "4.0.3" % Test
)

routesGenerator := InjectedRoutesGenerator

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.example.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.example.binders._"
