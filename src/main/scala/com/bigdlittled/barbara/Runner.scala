package com.bigdlittled.barbara

import breeze.linalg._
import org.scalameter.api._

object Runner extends App {
  
  val dv = DenseVector(1.0,2.0,3.0,4.0, 5.0)
  
  println(dv :*= 2.0).toString()

}
