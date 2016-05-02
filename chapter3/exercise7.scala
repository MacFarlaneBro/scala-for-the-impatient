object exercise7 {

  //Reverse order sorted array
  val array: Array[Int] = Array(1, 3, 3, 5, -2, 3, 2, 0, 1, 9, 2)

  val unique = array.distinct
  println(unique.deep.mkString)
}
