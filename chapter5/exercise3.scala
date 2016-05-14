class Time(val hrs: Int, val min: Int) {

  if(hrs > 24 || hrs < 0) throw new Exception("The hours supplied are not between 0 and 24")
  if(min > 60 || min < 0) throw new Exception("The minutes supplied are not between 0 and 60")

  def before(other: Time): Boolean = {
    if(other.hrs < hrs)
      false
    else if(other.hrs > hrs)
      true
    else if(other.min < min)
      false
    else
      true
  }
}
