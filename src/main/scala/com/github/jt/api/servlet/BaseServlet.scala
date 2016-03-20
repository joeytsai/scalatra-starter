package com.github.jt.api.servlet

import com.github.jt.util.JtJson
import org.scalatra.ScalatraServlet
import org.scalatra.json.JacksonJsonSupport

/**
 * Created by joeyt on 3/19/16.
 */
trait BaseServlet extends ScalatraServlet with JacksonJsonSupport {
  override protected implicit val jsonFormats = JtJson.formats

  before() {
    contentType = formats("json")
  }

}
