package typeclass.measures

import scala.runtime.FractionalProxy

/**
  * Created by Dorian Thiessen on 2018-03-07.
  */
abstract class Numbar {
  def toDouble: Double
}

class RichNumbar(val self: Double) extends AnyVal with FractionalProxy[Double] {
  override protected implicit def num: Fractional[Double] = scala.math.Numeric.DoubleIsFractional
  override protected implicit def integralNum: Integral[Double] = scala.math.Numeric.DoubleAsIfIntegral
  override protected def ord: Ordering[Double] = scala.math.Ordering.Double
}

import scala.math.Numeric.ExtraImplicits

class Nuzer() {
  //@inline def apply[T](implicit num: Numeric[T]): Numeric[T] = num
  //def plus[U: Numeric](x: U, y: U): U = x + y
}