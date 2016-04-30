object exercise4 {

  val array: Array[Int] = Array(1, -3, 3, 5, -2)

  val sortedArray: Array[Int] =
    array.filter((i: Int) => i > 0) ++ array.filter((i: Int) => i <=0)

  println(sortedArray.deep.mkString)
}
