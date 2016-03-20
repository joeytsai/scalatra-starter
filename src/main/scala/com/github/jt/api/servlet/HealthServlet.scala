package com.github.jt.api.servlet

import com.github.jt.api.payload.HealthPayload
import com.github.jt.sbt.BuildInfoScalatraStarter
import org.scalatra.Ok

/**
 * Created by joeyt on 3/19/16.
 */
class HealthServlet extends BaseServlet {

  get("/") {
    Ok(
      HealthPayload(
        BuildInfoScalatraStarter.name,
        BuildInfoScalatraStarter.version,
        BuildInfoScalatraStarter.gitHeadCommit,
        BuildInfoScalatraStarter.builtAtString
      )
    )
  }
}
