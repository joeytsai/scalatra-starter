package com.github.jt.api.servlet

import com.github.jt.api.payload.ErrorPayload
import com.github.jt.util.JtJson
import org.scalatra.{InternalServerError, ScalatraServlet}
import org.scalatra.json.JacksonJsonSupport

import scala.util.control.NonFatal

/**
 * Setup servlets to read and write json
 */
trait BaseServlet extends ScalatraServlet with JacksonJsonSupport {
  override protected implicit val jsonFormats = JtJson.formats

  before() {
    contentType = formats("json")
  }

  error {
    case NonFatal(e) => InternalServerError(ErrorPayload(e.getMessage, Option(e.getCause)))
  }
}
