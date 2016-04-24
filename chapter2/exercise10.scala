object exercise10{

  def computeX(x: Double, n: Int): Double = {
    if(n == 0){
      1
    } else {
      if(n < 0){
        1 / computeX(x, -n)
      } else {
        if(n > 2){
          if(n % 2 != 0){
            x * computeX(x, n-1)
          } else {
            computeX(computeX(x, n/2), 2)
          }
        } else x * computeX(x, n-1)
      }
    }
  }

}
