package typeclass.uncertain.math

import typeclass.uncertain.UncertainDouble

/**
  * For qualitative measure with uncertainty
  * Created by Dorian Thiessen on 2018-03-07.
  */
object UncertainNumeric {

  trait UncertainDoubleIsConflicted extends Numeric[UncertainDouble] {
    def plus(x: UncertainDouble, y: UncertainDouble): UncertainDouble = x + y

    def minus(x: UncertainDouble, y: UncertainDouble): UncertainDouble = x - y

    def times(x: UncertainDouble, y: UncertainDouble): UncertainDouble = x * y

    def negate(x: UncertainDouble): UncertainDouble = -x

    //def fromDouble(x: Double): UncertainDouble = x.toUncertainDouble
    //def parseString(str: String): Option[UncertainDouble] = Try(str.toUncertainDouble).toOption
    def toInt(x: UncertainDouble): Int = x.toInt

    def toLong(x: UncertainDouble): Long = x.toLong

    def toFloat(x: UncertainDouble): Float = x.toFloat

    def toDouble(x: UncertainDouble): Double = x.toDouble

    def toUncertainDouble(x: UncertainDouble): UncertainDouble = x
  }

  trait UncertainDoubleIsFractional extends UncertainDoubleIsConflicted with Fractional[UncertainDouble] {
    def div(x: UncertainDouble, y: UncertainDouble): UncertainDouble = x / y
  }

  trait UncertainDoubleAsIfIntegral extends UncertainDoubleIsConflicted with Integral[UncertainDouble] {
    //def quot(x: UncertainDouble, y: UncertainDouble): UncertainDouble = UncertainDouble(0)

    //(BigDecimal(x) quot BigDecimal(y)).doubleValue
    //def rem(x: UncertainDouble, y: UncertainDouble): UncertainDouble = UncertainDouble(0)

    //(BigDecimal(x) remainder BigDecimal(y)).doubleValue
  }

  /*implicit object UncertainDoubleIsFractional extends UncertainDoubleIsFractional with Ordering.DoubleOrdering {
    //override def fromInt(x: Int): UncertainDouble = UncertainDouble(x)

    //override def compare(x: UncertainDouble, y: UncertainDouble): Int = 0
  }*/
  /*object UncertainDoubleAsIfIntegral extends UncertainDoubleAsIfIntegral with Ordering.DoubleOrdering {
    //override def fromInt(x: Int): UncertainDouble = UncertainDouble(x)

    override def compare(x: UncertainDouble, y: UncertainDouble): Int =
      if (x.toDouble() > y.toDouble()) 1
      else -1
  }*/

  //trait
}

/**
  * For qualitative measure with uncertainty
  * Created by Dorian Thiessen on 2018-03-07.
  */
trait UncertainNumeric[T] extends Numeric[T] {
  class Ops(lhs: T) {
    def +(rhs: T) = plus(lhs, rhs)
    def -(rhs: T) = minus(lhs, rhs)
    def *(rhs: T) = times(lhs, rhs)
    def unary_-() = negate(lhs)
    def abs(): T = UncertainNumeric.this.abs(lhs)
    def signum(): Int = UncertainNumeric.this.signum(lhs)
    def toInt(): Int = UncertainNumeric.this.toInt(lhs)
    def toLong(): Long = UncertainNumeric.this.toLong(lhs)
    def toFloat(): Float = UncertainNumeric.this.toFloat(lhs)
    def toDouble(): Double = UncertainNumeric.this.toDouble(lhs)
  }
}


