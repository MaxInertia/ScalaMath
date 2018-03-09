package uncertainty

// State - A collection of variables specifying the state of the system at a given time

// UncertainValues - Numeric values with uncertainty
// TODO: Generalize this to a typeclass (extend Numeric?) to allow use of any number type
/*class UncertainDouble(v: Double, u: Double) {
  def +(x: UncertainDouble): UncertainDouble
}*/

/**
  * Created by Dorian Thiessen on 2018-03-08.
  */
trait Uncertain[T]

object Uncertain {
  /*def apply[T: Numeric[T]](v: T, u: T): UncertainNumeric[T] = v match {
    case _:Double  => new UncertainDouble(v.toDouble, u.toDouble)
   }*/
}

/*trait UncertainNumeric[T] extends Numeric[T] {
  def mean: T
  def uncertainty: T
  def max: T = implicitly[Numeric[T]].plus(mean, uncertainty)
  def min: T = implicitly[Numeric[T]].minus(mean, uncertainty)
}*/

// Create implicit conversions to/from any Uncertain[T] where T : Numeric
/*object ImplicitConversions {
  implicit def toUDouble(ui: UncertainInt): UncertainDouble =
    UncertainDouble(ui.m.toDouble, ui.u.toDouble)
}*/



//class Uncertain[T](v: T, u: Double)

//trait Uncertainty[T]
//class Uncertain[T](v: T, u: Uncertainty[T])