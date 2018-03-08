package typeclass.induction

/**
  * Created by Dorian Thiessen on 2018-03-07.
  */
/*trait DynDisp[E] {
  type Out
  def dispatch(name: String, msg: String): Option[Out]
}

trait Parser[A] {
  def parse(s: String): Option[A]
}

object Main extends App {
  import Named._

  implicit val base = new DynDisp[EOL] {
    type Out = Nothing
    def dispatch(n: String, m: String) = None
  }

  implicit def inductionStep[Head, Tail](
    implicit head: Named[Head], parser: Parser[Head], tailInst: DynDisp[Tail]
  ) = new DynDisp[(Head, Tail)] {
    type Out = Either[tailInst.Out, Head]

    def dispatch(name: String, msg: String): Option[Out] =
      if (name == head.name)
        parser.parse(msg).map(Right(_))
      else
        tailInst.dispatch(name, msg).map(Left(_))
  }

  //implicitly[DynDisp[(Int, (Char, (String, EOL)))]]
  val d = implicitly[DynDisp[(Int, (Char, (String, EOL)))]]
  d.dispatch("int", "10")
  d.dispatch("char","b")
}*/