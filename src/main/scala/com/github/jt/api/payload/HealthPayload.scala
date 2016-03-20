package com.github.jt.api.payload

/**
 * Created by joeyt on 3/19/16.
 */
case class HealthPayload(
                          projectName: String,
                          version: String,
                          gitCommitSha: String,
                          timeBuilt: String
                          )
