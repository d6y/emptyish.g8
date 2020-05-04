lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "$organization$",
      scalaVersion := "2.13.2",
    )),
    name := "emptyish",

    libraryDependencies ++= Seq(),

    // https://docs.scala-lang.org/overviews/compiler-options/index.html
    scalacOptions ++= Seq(
      "-encoding", "utf8",
      "-deprecation",
      "-unchecked",
      "-Xlint:type-parameter-shadow",
      "-Wvalue-discard",
    )

  )

// https://scalameta.org/munit/docs/getting-started.html
// lazy val testing = Seq(
//   "org.scalameta" %% "munit" % "0.7.5" % Test
// )
