object exercise2 {

  val array: Array[Int] =  Array(1, 2, 3, 4, 5)

  for(i <- 0 until array.length -1 if i % 2 == 0){
    val temp = array(i)
    array(i) = array(i+1)
    array(i+1) = temp
  }
  println(array.deep.mkString)
}

