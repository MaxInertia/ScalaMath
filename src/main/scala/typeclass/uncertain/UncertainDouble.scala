package typeclass.uncertain

/**
  * Created by Dorian Thiessen on 2018-03-07.
  */
final abstract class UncertainDouble private /*extends AnyVal*/ {
  def toByte: Byte
  def toShort: Short
  def toChar: Char
  def toInt: Int
  def toLong: Long
  def toFloat: Float
  def toDouble: Double
  def toUncertainDouble: UncertainDouble

  /** Returns this value, unmodified. */
  def unary_+ : UncertainDouble
  /** Returns the negation of this value. */
  def unary_- : UncertainDouble

  def +(x: String): String

  /** Returns `true` if this value is equal to x, `false` otherwise. */
  def ==(x: Byte): Boolean
  /** Returns `true` if this value is equal to x, `false` otherwise. */
  def ==(x: Short): Boolean
  /** Returns `true` if this value is equal to x, `false` otherwise. */
  def ==(x: Char): Boolean
  /** Returns `true` if this value is equal to x, `false` otherwise. */
  def ==(x: Int): Boolean
  /** Returns `true` if this value is equal to x, `false` otherwise. */
  def ==(x: Long): Boolean
  /** Returns `true` if this value is equal to x, `false` otherwise. */
  def ==(x: Float): Boolean
  /** Returns `true` if this value is equal to x, `false` otherwise. */
  def ==(x: Double): Boolean
  /** Returns `true` if this value is equal to x, `false` otherwise. */
  def ==(x: UncertainDouble): Boolean

  /** Returns `true` if this value is not equal to x, `false` otherwise. */
  def !=(x: Byte): Boolean
  /** Returns `true` if this value is not equal to x, `false` otherwise. */
  def !=(x: Short): Boolean
  /** Returns `true` if this value is not equal to x, `false` otherwise. */
  def !=(x: Char): Boolean
  /** Returns `true` if this value is not equal to x, `false` otherwise. */
  def !=(x: Int): Boolean
  /** Returns `true` if this value is not equal to x, `false` otherwise. */
  def !=(x: Long): Boolean
  /** Returns `true` if this value is not equal to x, `false` otherwise. */
  def !=(x: Float): Boolean
  /** Returns `true` if this value is not equal to x, `false` otherwise. */
  def !=(x: Double): Boolean
  /** Returns `true` if this value is not equal to x, `false` otherwise. */
  def !=(x: UncertainDouble): Boolean

  /** Returns `true` if this value is less than x, `false` otherwise. */
  def <(x: Byte): Boolean
  /** Returns `true` if this value is less than x, `false` otherwise. */
  def <(x: Short): Boolean
  /** Returns `true` if this value is less than x, `false` otherwise. */
  def <(x: Char): Boolean
  /** Returns `true` if this value is less than x, `false` otherwise. */
  def <(x: Int): Boolean
  /** Returns `true` if this value is less than x, `false` otherwise. */
  def <(x: Long): Boolean
  /** Returns `true` if this value is less than x, `false` otherwise. */
  def <(x: Float): Boolean
  /** Returns `true` if this value is less than x, `false` otherwise. */
  def <(x: Double): Boolean
  /** Returns `true` if this value is less than x, `false` otherwise. */
  def <(x: UncertainDouble): Boolean

  /** Returns `true` if this value is less than or equal to x, `false` otherwise. */
  def <=(x: Byte): Boolean
  /** Returns `true` if this value is less than or equal to x, `false` otherwise. */
  def <=(x: Short): Boolean
  /** Returns `true` if this value is less than or equal to x, `false` otherwise. */
  def <=(x: Char): Boolean
  /** Returns `true` if this value is less than or equal to x, `false` otherwise. */
  def <=(x: Int): Boolean
  /** Returns `true` if this value is less than or equal to x, `false` otherwise. */
  def <=(x: Long): Boolean
  /** Returns `true` if this value is less than or equal to x, `false` otherwise. */
  def <=(x: Float): Boolean
  /** Returns `true` if this value is less than or equal to x, `false` otherwise. */
  def <=(x: Double): Boolean
  /** Returns `true` if this value is less than or equal to x, `false` otherwise. */
  def <=(x: UncertainDouble): Boolean

  /** Returns `true` if this value is greater than x, `false` otherwise. */
  def >(x: Byte): Boolean
  /** Returns `true` if this value is greater than x, `false` otherwise. */
  def >(x: Short): Boolean
  /** Returns `true` if this value is greater than x, `false` otherwise. */
  def >(x: Char): Boolean
  /** Returns `true` if this value is greater than x, `false` otherwise. */
  def >(x: Int): Boolean
  /** Returns `true` if this value is greater than x, `false` otherwise. */
  def >(x: Long): Boolean
  /** Returns `true` if this value is greater than x, `false` otherwise. */
  def >(x: Float): Boolean
  /** Returns `true` if this value is greater than x, `false` otherwise. */
  def >(x: Double): Boolean
  /** Returns `true` if this value is greater than x, `false` otherwise. */
  def >(x: UncertainDouble): Boolean

  /** Returns `true` if this value is greater than or equal to x, `false` otherwise. */
  def >=(x: Byte): Boolean
  /** Returns `true` if this value is greater than or equal to x, `false` otherwise. */
  def >=(x: Short): Boolean
  /** Returns `true` if this value is greater than or equal to x, `false` otherwise. */
  def >=(x: Char): Boolean
  /** Returns `true` if this value is greater than or equal to x, `false` otherwise. */
  def >=(x: Int): Boolean
  /** Returns `true` if this value is greater than or equal to x, `false` otherwise. */
  def >=(x: Long): Boolean
  /** Returns `true` if this value is greater than or equal to x, `false` otherwise. */
  def >=(x: Float): Boolean
  /** Returns `true` if this value is greater than or equal to x, `false` otherwise. */
  def >=(x: Double): Boolean
  /** Returns `true` if this value is greater than or equal to x, `false` otherwise. */
  def >=(x: UncertainDouble): Boolean

  /** Returns the sum of this value and `x`. */
  def +(x: Byte): UncertainDouble
  /** Returns the sum of this value and `x`. */
  def +(x: Short): UncertainDouble
  /** Returns the sum of this value and `x`. */
  def +(x: Char): UncertainDouble
  /** Returns the sum of this value and `x`. */
  def +(x: Int): UncertainDouble
  /** Returns the sum of this value and `x`. */
  def +(x: Long): UncertainDouble
  /** Returns the sum of this value and `x`. */
  def +(x: Float): UncertainDouble
  /** Returns the sum of this value and `x`. */
  def +(x: Double): UncertainDouble
  /** Returns the sum of this value and `x`. */
  def +(x: UncertainDouble): UncertainDouble

  /** Returns the difference of this value and `x`. */
  def -(x: Byte): UncertainDouble
  /** Returns the difference of this value and `x`. */
  def -(x: Short): UncertainDouble
  /** Returns the difference of this value and `x`. */
  def -(x: Char): UncertainDouble
  /** Returns the difference of this value and `x`. */
  def -(x: Int): UncertainDouble
  /** Returns the difference of this value and `x`. */
  def -(x: Long): UncertainDouble
  /** Returns the difference of this value and `x`. */
  def -(x: Float): UncertainDouble
  /** Returns the difference of this value and `x`. */
  def -(x: Double): UncertainDouble
  /** Returns the difference of this value and `x`. */
  def -(x: UncertainDouble): UncertainDouble

  /** Returns the product of this value and `x`. */
  def *(x: Byte): UncertainDouble
  /** Returns the product of this value and `x`. */
  def *(x: Short): UncertainDouble
  /** Returns the product of this value and `x`. */
  def *(x: Char): UncertainDouble
  /** Returns the product of this value and `x`. */
  def *(x: Int): UncertainDouble
  /** Returns the product of this value and `x`. */
  def *(x: Long): UncertainDouble
  /** Returns the product of this value and `x`. */
  def *(x: Float): UncertainDouble
  /** Returns the product of this value and `x`. */
  def *(x: Double): UncertainDouble
  /** Returns the product of this value and `x`. */
  def *(x: UncertainDouble): UncertainDouble

  /** Returns the quotient of this value and `x`. */
  def /(x: Byte): UncertainDouble
  /** Returns the quotient of this value and `x`. */
  def /(x: Short): UncertainDouble
  /** Returns the quotient of this value and `x`. */
  def /(x: Char): UncertainDouble
  /** Returns the quotient of this value and `x`. */
  def /(x: Int): UncertainDouble
  /** Returns the quotient of this value and `x`. */
  def /(x: Long): UncertainDouble
  /** Returns the quotient of this value and `x`. */
  def /(x: Float): UncertainDouble
  /** Returns the quotient of this value and `x`. */
  def /(x: Double): UncertainDouble
  /** Returns the quotient of this value and `x`. */
  def /(x: UncertainDouble): UncertainDouble

  /** Returns the remainder of the division of this value by `x`. */
  def %(x: Byte): UncertainDouble
  /** Returns the remainder of the division of this value by `x`. */
  def %(x: Short): UncertainDouble
  /** Returns the remainder of the division of this value by `x`. */
  def %(x: Char): UncertainDouble
  /** Returns the remainder of the division of this value by `x`. */
  def %(x: Int): UncertainDouble
  /** Returns the remainder of the division of this value by `x`. */
  def %(x: Long): UncertainDouble
  /** Returns the remainder of the division of this value by `x`. */
  def %(x: Float): UncertainDouble
  /** Returns the remainder of the division of this value by `x`. */
  def %(x: Double): UncertainDouble
  /** Returns the remainder of the division of this value by `x`. */
  def %(x: UncertainDouble): UncertainDouble

  // Provide a more specific return type for Scaladoc
  //override def getClass(): Class[UncertainDouble] = ???
}
/*
object UncertainDouble extends AnyValCompanion {

}*/