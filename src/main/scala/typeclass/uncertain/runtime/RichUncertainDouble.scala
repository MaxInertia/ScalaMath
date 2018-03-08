package typeclass.uncertain.runtime

import typeclass.uncertain.UncertainDouble
import typeclass.uncertain.math.{UncertainNumeric, UncertainOrdering}
//import typeclass.uncertain.math.UncertainOrdering.UncertainDouble

import scala.runtime.FractionalProxy

/**
  * Created by Dorian Thiessen on 2018-03-07.
  */
/*class RichUncertainDouble(val self: UncertainDouble) extends AnyVal with FractionalProxy[UncertainDouble] {
  override protected implicit def num: Fractional[UncertainDouble] = UncertainNumeric.UncertainDoubleIsFractional
  override protected implicit def integralNum: Integral[UncertainDouble] = UncertainNumeric.UncertainDoubleAsIfIntegral
  override protected def ord: Ordering[UncertainDouble] = UncertainOrdering.UncertainDouble
}*/

object RichUncertainDouble {
  implicit def toDouble(x: UncertainDouble): Double = x.toDouble
  //implicit def toUncertainDouble(x: Double): UncertainDouble = UncertainDouble(x)

  //def apply(x: Double) = new RichUncertainDouble(x)
}

