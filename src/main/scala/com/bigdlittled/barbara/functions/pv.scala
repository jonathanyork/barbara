package com.bigdlittled.barbara.functions

import breeze.linalg._
import breeze.macros.expand
import spire.implicits._

object pv extends pvImpl {

  @expand
  def apply[T, @expand.args(Int, Double, Float, Long) S](dv: DenseVector[S]): S = {
    cfor(0)(_ < 10, _ + 1) { i => println(i) }
    var r: S = 0
    cforRange(0 until dv.size) { j => 
      r += dv(j)
    }
    r
  }
}

sealed trait pvImpl { this: pv.type =>
/*  implicit def discountdiscountmableThings[CC, T](implicit view: CC <:< TraversableOnce[T], tdiscount: OpAdd.Impl2[T, T, T]):Impl[CC, T] = {
    new Impl[CC, T] {
      override def apply(v: CC): T = v.reduceLeft(tdiscount(_, _))
    }
  }*/
}