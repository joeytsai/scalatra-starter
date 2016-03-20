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
    "title",
    "description",
    "tosUrl",
    "contact",
    "license",
    "licenseUrl"
  )
  
  val swagger = new Swagger(Swagger.SpecVersion, apiVersion, apiInfo)
}
