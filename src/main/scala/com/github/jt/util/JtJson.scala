package com.github.jt.util

import org.json4s.ext.JodaTimeSerializers
import org.json4s.jackson.Serialization
import org.json4s.{DefaultFormats, Formats}

/**
 * Created by joeyt on 3/19/16.
 */
object JtJson {
  implicit val formats: Formats = DefaultFormats.withBigDecimal ++ JodaTimeSerializers.all

  // parses the json string into a case class
  def fromJsonString[CC](json: String)(implicit m: Manifest[CC]): CC = Serialization.read(json)

  // returns the json string, from a case class
  def toJsonString[CC <: AnyRef](caseClass: CC): String = Serialization.write(caseClass)
}
