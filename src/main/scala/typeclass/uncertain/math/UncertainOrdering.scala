package typeclass.uncertain.math

import typeclass.uncertain.UncertainDouble
import typeclass.uncertain.runtime.RichUncertainDouble

import scala.math.LowPriorityOrderingImplicits

/**
  * Created by Dorian Thiessen on 2018-03-07.
  */
trait UncertainOrdering[T] extends Ordering[T] {
  class Ops(lhs: T) {
    def <(rhs: T) = lt(lhs, rhs)
    def <=(rhs: T) = lteq(lhs, rhs)
    def >(rhs: T) = gt(lhs, rhs)
    def >=(rhs: T) = gteq(lhs, rhs)
    def equiv(rhs: T) = UncertainOrdering.this.equiv(lhs, rhs)
    def max(rhs: T): T = UncertainOrdering.this.max(lhs, rhs)
    def min(rhs: T): T = UncertainOrdering.this.min(lhs, rhs)
  }
  //override implicit def mkOrderingOps(lhs: T): Ops = new Ops(lhs)
}

object UncertainOrdering extends LowPriorityOrderingImplicits  {
  import Ordering.Implicits

  //implicit def toDouble(x: UncertainDouble) = x.toDouble
  //implicit def toUncertainDouble(x: Double) = RichUncertainDouble(x)

  trait UncertainDoubleOrdering extends UncertainOrdering[UncertainDouble] {
    outer =>

    //def compare(x: UncertainDouble, y: UncertainDouble) = java.lang.Double.compare(x, y)

    override def lteq(x: UncertainDouble, y: UncertainDouble): Boolean = x <= y
    override def gteq(x: UncertainDouble, y: UncertainDouble): Boolean = x >= y
    override def lt(x: UncertainDouble, y: UncertainDouble): Boolean = x < y
    override def gt(x: UncertainDouble, y: UncertainDouble): Boolean = x > y
    override def equiv(x: UncertainDouble, y: UncertainDouble): Boolean = x == y
    //override def max(x: UncertainDouble, y: UncertainDouble): UncertainDouble = math.max(x, y)
    //override def min(x: UncertainDouble, y: UncertainDouble): UncertainDouble = math.min(x, y)

    override def reverse: UncertainOrdering[UncertainDouble] = new UncertainDoubleOrdering {
      override def reverse = outer
      override def compare(x: UncertainDouble, y: UncertainDouble) = outer.compare(y, x)

      override def lteq(x: UncertainDouble, y: UncertainDouble): Boolean = outer.lteq(y, x)
      override def gteq(x: UncertainDouble, y: UncertainDouble): Boolean = outer.gteq(y, x)
      override def lt(x: UncertainDouble, y: UncertainDouble): Boolean = outer.lt(y, x)
      override def gt(x: UncertainDouble, y: UncertainDouble): Boolean = outer.gt(y, x)
      override def min(x: UncertainDouble, y: UncertainDouble): UncertainDouble = outer.max(x, y)
      override def max(x: UncertainDouble, y: UncertainDouble): UncertainDouble = outer.min(x, y)
    }
  }
  //implicit object UncertainDouble extends UncertainDoubleOrdering
}