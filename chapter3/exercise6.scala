import scala.collection.mutable.ArrayBuffer

object exercise6 {

  //Reverse order sorted array
  val array: Array[Int] = Array(1, -3, 3, 5, -2)
  scala.util.Sorting.quickSort(array)
  val reverseSorted: Array[Int] = array.reverse

  println(reverseSorted.deep.mkString)

  //Reverse order sorted arraybuffer
  val array2: ArrayBuffer[Int] = ArrayBuffer(1, -3, 3, 5, -2)
  val reverseSorted2: ArrayBuffer[Int] = array2.sorted.reverse

  println(reverseSorted2.mkString)
}
