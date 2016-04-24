object exercise10 {

  val astring: String = "a string"

  //Return the first n characters from the string
  astring.take(n)

  //Return the last string.length - n characters of the string
  astring.drop(n)

  //Return the last n characters of the string
  astring.takeRight(n)

  //Return the first string.length - n characters of the string
  astring.dropRight(n)

  /*
   These methods have the advantage of more explicitly specifying the intention of the string operation and reducing the number of arguments required in most cases.
   */
}
