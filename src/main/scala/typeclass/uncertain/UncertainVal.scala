package typeclass.uncertain

/**
  * Created by Dorian Thiessen on 2018-03-07.
  */
/*trait Uncertain[T <: Integral[T]] {
  def from[T](value: T, delta: T) = Uncertain(value, delta)
}

class UncertainVal[T : Integral](m: T, u: T) /*extends NumericRange[T]*/ {
  /*override val start: T = m - u
  override val end: T = m + u
  override val step: T = 0*/
}

object Uncertain {
  implicit def fromInt(x: Int): UncertainVal[Int] = Uncertain[Int](x, 0)
  //implicit val fromFloat:      Approx[Float]      = (x: Float)      => Approx(x, 0)
  //implicit val fromDouble:     Approx[Double]     = (x: Double)     => Approx(x, 0)
  //implicit val fromBigDecimal: Approx[BigDecimal] = (x: BigDecimal) => Approx(x, 0)

  //def apply[T: Integral](v: T) = new UncertainVal[T](v, math.floor(Double.MinPositiveValue))
  def apply[T: Integral](v: T, u: T) = new UncertainVal[T](v, u)
}*/

trait UncertainVal[T] {

}

object UncertainVal {
  @inline def apply[T](implicit num: Numeric[T]): Numeric[T] = num

  /*trait UncertainAsIntegral extends Integral[UncertainValue] {

  }*/
}