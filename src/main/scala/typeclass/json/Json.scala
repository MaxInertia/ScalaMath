package typeclass.json

/**
  * Created by Dorian Thiessen on 2018-03-06.
  */
trait Json[A] {
  def json(value: A): JsonValue
}

object Json {
  implicit val intJson: Json[Int] =
    new Json[Int] { def json(n: Int): JsonValue = JsonNumber(n) }

  implicit def pairJson[T1 : Json, T2 : Json]: Json[(T1, T2)] =
    new Json[(T1, T2)] {
      def json(pair: (T1, T2)): JsonValue = JsonObject(
        Map("fst" -> implicitly[Json[T1]].json(pair._1),
            "snd" -> implicitly[Json[T2]].json(pair._2))
      )
    }

  implicit val strJson: Json[String] =
    new Json[String] { def json(s: String): JsonValue = JsonString(s)}
}