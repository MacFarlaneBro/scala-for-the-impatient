object exercise2 {

  val newMap = scala.collection.mutable.Map[String, Int]()

  val in = new java.util.Scanner(new java.io.File("newFile.txt"))
  while(in.hasNext()){
    newMap(in.next) =  newMap.getOrElse(in.next, 0) + 1
  }

  println(newMap)
}
