class Person(name: String) {
  
  val firstName = name.split(" ")(0)
  val secondName = name.split(" ")(1)
  
}

/*
 The parameter should be a plain parameter as it is only needed in the initialisation of the object, this way it is discarded
 and cannot be accessed at a later time.
 */
