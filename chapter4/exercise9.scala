object exercise9 {

  val intArray = Array(1, 2, 4, 6, 12, 64, 12, 6, 1, 0, -1, 32, -89)

  def lteqgt(values: Array[Int], v: Int): Tuple3[Int, Int, Int] = {
    (intArray.count(_ > v),
    intArray.count(_ == v),
    intArray.count(_ < v))
  }

  println(lteqgt(intArray, 12))
}

