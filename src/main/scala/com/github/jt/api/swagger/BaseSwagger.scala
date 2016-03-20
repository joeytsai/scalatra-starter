package com.github.jt.api.swagger

import org.scalatra.Ok
import org.scalatra.swagger.{StringResponseMessage, SwaggerSupport}

/**
 * Created by joeyt on 3/19/16.
 */
trait BaseSwagger extends SwaggerSupport {
  implicit val swagger = SwaggerSetup.swagger

  def messageOk(reason: String): StringResponseMessage = StringResponseMessage(Ok().status.code, reason)

}
