
lazy val plugin = (project in file("."))
  .enablePlugins(JtRestPlugin)
  .settings(
    name := "scalatra-starter",
    containerPort := 8080
  )

