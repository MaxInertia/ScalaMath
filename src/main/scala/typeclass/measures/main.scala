package typeclass.measures

/**
  * Created by Dorian Thiessen on 2018-03-07.
  */
object main extends App {
  println(0 to 10)

  val rn2 = new RichNumbar(2)
  val rn4 = new RichNumbar(4)
  println(rn2 +"+"+ rn4)
  //println(rn2 + rn4)

  println(math.floor(Double.MinPositiveValue))
}
