package com.bigdlittled.barbara

import org.scalameter.api._
import breeze.linalg._

class RunnerTest extends Bench.OfflineReport {
  val sizes = Gen.range("size")(300000, 1500000, 300000)

  val ranges = for {
    size <- sizes
  } yield DenseVector.fill(size, 1)

  performance of "DenseVector" in {
    measure method "reduce" in {
      using(ranges) in {
        r => r.reduce(_ + _)
      }
    }
  }
  performance of "DenseVector" in {
    measure method "sum" in {
      using(ranges) in {
        r => sum(r)
      }
    }
  }
  performance of "DenseVector" in {
    measure method "dotproduct" in {
      using(ranges) in {
        r => r dot r
      }
    }
  }}
