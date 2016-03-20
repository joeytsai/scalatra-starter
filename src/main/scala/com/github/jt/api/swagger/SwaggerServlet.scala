package com.github.jt.api.swagger

import org.scalatra.ScalatraServlet
import org.scalatra.swagger.{Swagger, ApiInfo, JacksonSwaggerBase}

/**
 * Setup Swagger
 */
class SwaggerServlet extends ScalatraServlet with JacksonSwaggerBase {
  implicit val swagger = SwaggerSetup.swagger
}

object SwaggerSetup {
  private val apiVersion = "1.0"
  private val apiInfo = ApiInfo(
    "Scalatra REST API",
    "Example project",
    "tosUrl",
    "contact",
    "Apache License",
    "http://choosealicense.com/licenses/apache-2.0/"
  )
  
  val swagger = new Swagger(Swagger.SpecVersion, apiVersion, apiInfo)
}
