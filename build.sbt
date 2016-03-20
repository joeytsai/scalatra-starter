
lazy val restApi = (project in file("."))
  .enablePlugins(JtRestPlugin)
  .settings(
    name := "scalatra-starter",
    containerPort := 8080,
    buildInfoObject := "BuildInfoScalatraStarter"
  )

