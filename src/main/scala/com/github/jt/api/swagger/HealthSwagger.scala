package com.github.jt.api.swagger

import com.github.jt.api.payload.HealthPayload

/**
 * Created by joeyt on 3/19/16.
 */
trait HealthSwagger extends BaseSwagger {
  override protected val applicationDescription = "Health check endpoint"

  val getHealth = apiOperation[HealthPayload]("getHealth")
    .summary("simple health check")
    .notes("returns static build info")
    .responseMessage(messageOk("success"))

}
