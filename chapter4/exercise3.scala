object exercise3 {

  var newMap = Map[String, Int]()

  val in = new java.util.Scanner(new java.io.File("newFile.txt"))
  while(in.hasNext()){
    newMap = newMap + (in.next -> (newMap.getOrElse(in.next, 0) + 1))
  }

  println(newMap)
}
