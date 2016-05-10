import scala.collection.JavaConversions.mapAsScalaMap

object exercise5 {

  var newMap = new java.util.TreeMap[String, Int]()

  val in = new java.util.Scanner(new java.io.File("newFile.txt"))
  while(in.hasNext()){
    newMap(in.next) = (newMap.getOrElse(in.next, 0) + 1)
  }

  println(newMap)
}
