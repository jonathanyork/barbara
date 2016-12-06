package com.bigdlittled.barbara

import org.scalameter.api._
import breeze.linalg._
import com.bigdlittled.barbara.functions._

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
    measure method "sum" in {
      using(ranges) in {
        r => sum(r)
      }
    }
    measure method "discount" in {
      using(ranges) in {
        r => discount(r)
      }
    }
    measure method "pv" in {
      using(ranges) in {
        r => pv(r)
      }
    }
    measure method "dotproduct" in {
      using(ranges) in {
        r => r dot r
      }
    }
    measure method "add" in {
      using(ranges) in {
        r => r + r
      }
    }
    measure method "accumulate" in {
      using(ranges) in {
        r => accumulate(r)
      }
    }
  }
}
