import scala.collection.JavaConversions.propertiesAsScalaMap

object exercise7 {

  val props: scala.collection.Map[String, String] = System.getProperties()
  
  val longestKey = props.keySet.maxBy(_.length).length

  for((k, v) <- props){
    println(k.padTo(longestKey, " ").mkString + " | " + v)
  }

}

