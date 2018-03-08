package typeclass.induction

/**
  * Created by Dorian Thiessen on 2018-03-07.
  */
//class TypeList {}

trait Named[E] { val name: String }

object Named {
  // type-level Nil
  type EOL = Unit

  implicit val namedInt: Named[Int] = new Named[Int] {val name = "int"}
  implicit val namedChar: Named[Char] = new Named[Char] {val name = "char"}
  implicit val namedString: Named[String] = new Named[String] {val name = "str"}
  implicit val namedEOL: Named[EOL] = new Named[EOL] {val name = ""}

  implicit def inductionStep[Head, Tail](
    implicit
    namedHead: Named[Head],
    namedTail: Named[Tail]
  ): Named[(Head, Tail)] = new Named[(Head, Tail)] {
    val name = s"${namedHead.name}, ${namedTail.name}"
  }
  // encode [Int, Char, String] as
  //(Int, (Char, (String, EOL)))
}

/*object Main extends App {


  type EOL = Unit
  println(implicitly[Named[(Int, (Char, (String, EOL)))]].name)
}*/