lazy val root = project.in(file(".")).
  enablePlugins(ScalaJSPlugin)

name := "jsext Library for Scala.js"

normalizedName := "querki-jsext"

version := "0.13"

organization := "org.querki"

ThisBuild / scalacOptions ++= Seq("-feature", "-deprecation")

scalaVersion := "3.7.4"


run / fork := true
