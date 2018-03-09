package uncertainty

/**
  * Created by Dorian Thiessen on 2018-03-09.
  */
trait UIntegral[T] extends Uncertain[T] with Integral[T] // To set operations specific to UIntegrals

object UIntegral {
  @inline def apply[T](implicit uf: UIntegral[T]): UIntegral[T] = uf

  trait UIntIsIntegral extends UIntegral[UInt] {
    // Operations
    override def plus(x: UInt, y: UInt): UInt = UInt(x.m + y.m, x.u + y.u)
    override def minus(x: UInt, y: UInt): UInt = UInt(x.m - y.m, x.u + y.u)
    override def times(x: UInt, y: UInt): UInt = UInt(x.m * y.m, x.m * y.u + y.m * x.u)
    override def negate(x: UInt): UInt = UInt(-x.m, x.u)
    override def quot(x: UInt, y: UInt): UInt = UInt(0,0) // TODO: Implement
    override def rem(x: UInt, y: UInt): UInt = UInt(0,0) // TODO: Implement
    // Conversions
    override def fromInt(x: Int): UInt = UInt(x.toInt, 0)
    override def toInt(x: UInt): Int = x.m.toInt
    override def toLong(x: UInt): Long = x.m.toLong
    override def toFloat(x: UInt): Float = x.m.toFloat
    override def toDouble(x: UInt): Double = x.m.toDouble
    // Comparator
    override def compare(x: UInt, y: UInt): Int =
      if ((x.max > y.min && x.min < y.max) ||
        (y.max > x.min && y.min < x.max)) 0
      else if (x.max < y.min) -1
      else -1
  }
  implicit object UIntIsIntegral extends UIntIsIntegral


}