object exercise9 {
  
  def product(theString: String): Long = {
    if(theString.length > 0)
      product(theString.dropRight(1)) * theString.last
    else
      1l
  }

}

