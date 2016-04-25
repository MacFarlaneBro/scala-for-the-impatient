import scala.math._
import scala.collection.mutable.ArrayBuffer


object exercise1 {

  def randomArray(len: Int): Array[Int] = {
    val a = new ArrayBuffer[Int]();
    for(i <- 0 to len){
      a += (random * 100).toInt % len
    }
    a.toArray
  }
}
