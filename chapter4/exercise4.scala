object exercise4 {

  var newMap = scala.collection.immutable.SortedMap[String, Int]()

  val in = new java.util.Scanner(new java.io.File("newFile.txt"))
  while(in.hasNext()){
    newMap = newMap + (in.next -> (newMap.getOrElse(in.next, 0) + 1))
  }

  println(newMap)
}
