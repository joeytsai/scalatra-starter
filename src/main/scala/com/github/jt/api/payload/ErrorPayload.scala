package com.github.jt.api.payload

/**
 * Created by joeyt on 3/19/16.
 */
case class ErrorPayload(
                         message: String,
                         cause: Option[Throwable] = None
                         )
