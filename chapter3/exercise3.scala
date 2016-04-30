object exercise3 {

  val array: Array[Int] =  Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

  val alteredArray: Array[Int] = (for(i <- 0 until array.length)
  yield if(i % 2 == 0)
    if(i == array.length - 1)
      array(i)
    else
      array(i+1)
  else
    array(i-1)).toArray

  println(alteredArray.deep.mkString)
}
