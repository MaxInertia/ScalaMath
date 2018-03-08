package typeclass.approx

/**
  * Created by Dorian Thiessen on 2018-03-06.
  */
trait ApproxValue
case class ApproxInt   (v: Int, u: Int)       extends ApproxValue
case class ApproxDouble(v: Double, u: Double) extends ApproxValue
case class ApproxFloat (v: Double, u: Double) extends ApproxValue
