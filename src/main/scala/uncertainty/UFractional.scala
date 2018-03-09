package uncertainty

/**
  * Created by Dorian Thiessen on 2018-03-09.
  */
trait UFractional[T] extends Uncertain[T] with Fractional[T] // To set operations specific to UncertainFractionals

object UFractional {
  @inline def apply[T](implicit uf: UFractional[T]): UFractional[T] = uf

  trait UDoubleIsFractional extends UFractional[UDouble] {
    // Operations
    override def plus(x: UDouble, y: UDouble): UDouble = UDouble(x.m + y.m, x.u + y.u)
    override def minus(x: UDouble, y: UDouble): UDouble = UDouble(x.m - y.m, x.u + y.u)
    override def times(x: UDouble, y: UDouble): UDouble = UDouble(x.m * y.m, x.m * y.u + y.m * x.u)
    override def div(x: UDouble, y: UDouble): UDouble = UDouble(x.m / y.m, x.u / y.m + x.m * y.u / (y.m * y.m))
    override def negate(x: UDouble): UDouble = UDouble(-x.m, x.u)
    // Conversions
    override def fromInt(x: Int): UDouble = UDouble(x.toDouble, 0)
    override def toInt(x: UDouble): Int = x.m.toInt
    override def toLong(x: UDouble): Long = x.m.toLong
    override def toFloat(x: UDouble): Float = x.m.toFloat
    override def toDouble(x: UDouble): Double = x.m
    // Comparator
    override def compare(x: UDouble, y: UDouble): Int =
      if ((x.m > y.min && x.min < y.max) ||
        (y.max > x.min && y.min < x.max)) 0
      else if (x.max < y.min) -1
      else -1
  }
  implicit object UDoubleIsFractional extends UDoubleIsFractional


}


