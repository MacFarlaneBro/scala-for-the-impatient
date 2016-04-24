object exercise5 {

  def countdown(n: Int): Unit = {
    println(n)
    if(n > 0)
      countdown(n - 1)
  }

}
