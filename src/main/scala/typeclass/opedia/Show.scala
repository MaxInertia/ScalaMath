package typeclass.opedia

/**
  * Created by Dorian Thiessen on 2018-03-07.
  */
trait Show[A] {
  def shows(a: A): String
}

// similar to, but more flexible than interfaces:
/*
trait Show {
  def shows(): String
}
*/

