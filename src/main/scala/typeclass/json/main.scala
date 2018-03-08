package typeclass.json

import typeclass.approx._

object main {
  def main(ars: Array[String]): Unit = {
    Stuff.doStuff()
    jsonT()
  }

  implicit val booleanJson: Json[Boolean] =
    new Json[Boolean] { def json(b: Boolean): JsonValue = JsonBoolean(b)}

  def jsonT(): Unit = {
    println("Json String:")
    val v = "hello world!"
    val jv = JsonWriter.write(JsonWriter.write(v))
    println(jv+"\n")

    println("Json Int:")
    val x = 2
    val xJson = JsonWriter.write(x)
    println(JsonWriter.write(xJson)+"\n")

    println("Json Boolean:")
    val b = true
    val bJson = JsonWriter.write(b)
    println(JsonWriter.write(bJson)+"\n")
  }
}

object Stuff {
  implicit val doubleAppr: Approx[(Double, Double)] =
    (x: (Double, Double)) => ApproxDouble(x._1, x._2)

  def doStuff(): Unit = {
    println("Approx Int:")
    val int: Int = 3
    val intA = ApproxEvaluator.evaluate(int)
    println(intA +"\n")

    println("Approx Double:")
    val double: Double = 3.21
    val doubleA = ApproxEvaluator.evaluate(double)
    println(doubleA+"\n")

    println("Approx (Double, Double)")
    val dt2: (Double, Double) = (2.34, 0.16)
    val dt2A = ApproxEvaluator.evaluate(dt2)
    println(dt2A+"\n")

  }
}