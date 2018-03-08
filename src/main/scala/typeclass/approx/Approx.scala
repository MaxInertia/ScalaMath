package typeclass.approx

/**
  * Created by Dorian Thiessen on 2018-03-06.
  */
trait Approx[A] {
  def approx (expr: A): ApproxValue
}

object ApproxEvaluator {
  def evaluate[A : Approx](x: A): ApproxValue =
    implicitly[Approx[A]].approx(x)
}

object Approx {
  implicit val intAppr: Approx[Int] = (x: Int) => ApproxInt(x, 0)

  implicit val doubleAppr: Approx[Double] = (x: Double) => ApproxDouble(x, 0)
}