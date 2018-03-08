package typeclass

import typeclass.opedia.Show

/**
  * Created by Dorian Thiessen on 2018-03-07.
  */
object Main extends App {
  //implicit def toUncertainDouble(x: Double): UncertainDouble = new RichUncertainDouble(x)
  //val ud1: UncertainDouble = 6.0


  implicit val IntShow = new Show[Int] {
    def shows(a: Int) = a.toString
  }

  // Scala implicit
  def shows[A](a: A)(implicit shower: Show[A]) = shower.shows(a)
  // Context bound:
  //def shows[A: Show](a: A) = implicitly[Show[A]].shows(a)
  //(implicitly is part of predef:def implicitly[A](implicit a: A) = a)

  // ScalaZ piumps a set of common typeclasses for us, so we can do:
  // 3.shows

  println (shows(2))
}
