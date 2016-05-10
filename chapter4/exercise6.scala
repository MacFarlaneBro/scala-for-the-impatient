object exercise6 {

  val newMap = new scala.collection.mutable.LinkedHashMap[String, Int]()
    newMap += (("Monday" -> java.util.Calendar.MONDAY),
    ("Tuesday" -> java.util.Calendar.TUESDAY),
    ("Wednesday" -> java.util.Calendar.WEDNESDAY),
    ("Thursday" -> java.util.Calendar.THURSDAY),
    ("Friday" -> java.util.Calendar.FRIDAY),
    ("Saturday" -> java.util.Calendar.SATURDAY),
    ("Sunday" -> java.util.Calendar.SUNDAY))

  for((k, v) <- newMap) println(k + v)
}
