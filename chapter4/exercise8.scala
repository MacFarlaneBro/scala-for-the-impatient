object exercise8 {

  val intArray = Array(1, 2, 4, 6, 12, 64, 12, 6, 1, 0, -1, 32, -89)

  def minMax(array: Array[Int]): Tuple2[Int, Int] = {
    (array.min, array.max)
  }

  println(minMax(intArray))

}

