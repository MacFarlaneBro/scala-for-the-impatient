object exercise1 {

  val myMap = Map("Telly" -> 10.99, "Radio" -> 13.99, "Mobile" -> 2.50)

  println(myMap)

  val reducedPrices = for((k, v) <- myMap) yield (k, v * 0.9)
  
  println(reducedPrices)

}
