object exercise8 {
  
  def product(theString: String): Long = {
    theString.foldLeft(1l)(_ * _)
  }

}

