package typeclass.json

/**
  * Created by Dorian Thiessen on 2018-03-06.
  */
object JsonWriter {

  def write(value: JsonValue): String =
    value match {
      case JsonObject(entries) => {
        val serializedEntries =
          for ((key, value) <- entries) yield key +":"+ write(value)
        "{" + (serializedEntries mkString ", ") +" }"
      }
      case JsonArray(entries) => {
        val serializedEntries = entries map write
        "[ "+ (serializedEntries mkString ", ") +" ]"
      }
      case JsonString(value) => "\""+ value +"\""
      case JsonNumber(value) => value.toString
      case JsonBoolean(value) => value.toString
      case JsonNull => "null"
    }

  // A is context bound by the JsonConverter typeclass.
  // A is a member of the JsonConverter typeclass
  def write[A : Json](value: A): String = {
    write(implicitly[Json[A]].json(value))
  }
}
