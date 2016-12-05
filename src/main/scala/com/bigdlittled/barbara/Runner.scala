package com.bigdlittled.barbara

import breeze.linalg._
import breeze.numerics._
import org.scalameter.api._
import com.typesafe.scalalogging._

import org.slf4j.LoggerFactory;

object Runner extends App {

  val logger = Logger(LoggerFactory.getLogger("com.bigdlittled.barbara"))
      
  val dv = DenseVector(1.0,2.0,3.0,4.0, 5.0)

  logger.info("This is very convenient ;-)")
  logger.debug("This is a debug log!")
  
  println("Sum: " + sum(dv))
  
  println("Reduce: " + dv.reduce(_ + _))

  println("Dot: " + (dv dot dv))
  println("Add: " + (dv + dv))
  
  println("Accumulate: " + accumulate(dv))
  println("Geometric Accumulate: " + exp(accumulate(log(dv))))

}
