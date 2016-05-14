/*
 Not 100% this does what was asked of but I'm fairly sure it does.
 */
class Time(val hrs: Int, val min: Int) {

  val time = (hrs * 60) + min

  if(hrs > 24 || hrs < 0) throw new Exception("The hours supplied are not between 0 and 24")
  if(min > 60 || min < 0) throw new Exception("The minutes supplied are not between 0 and 60")

  def before(other: Time): Boolean = {
    if(other.time < time)
      true
    else
      false
  }
}
