lazy val root = (project in file(".")).
    settings(
        inThisBuild(List(
            organization := "com.mativega",
            scalaVersion := "2.13.10"
        )),
        name := "MativegaScala",
        version := "0.1",
        Test / parallelExecution := false,
        Test / testOptions += Tests.Argument("-oD")

    )

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.9" % Test