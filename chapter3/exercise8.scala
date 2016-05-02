import scala.collection.mutable.ArrayBuffer

/*
 This works though I'm fairly sure I'm not doing it the way that the book intended.
 */
object exercise8 {

  //Reverse order sorted array
  val array: ArrayBuffer[Int] = ArrayBuffer(1, 3, 3, 5, -2, -3, 2, 0, 1, -9, 2)

  val indexArray = (for(i <- 0 until array.length if array(i) < 0) yield i).reverse.dropRight(1)
  println(indexArray.mkString)

  val endArray = for(i <- 0 until array.length if !indexArray.contains(i)) yield array(i)
  
  println(endArray)
}
