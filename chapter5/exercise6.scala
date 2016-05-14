/*
 There's a typo in the question here, it says the Person class is in section 5.1 when in fact it's in 5.2
 */

class Person(newAge: Int) {

  private var privateAge = if(newAge < 0) 0 else newAge

  def age = privateAge
  def age_=(newValue: Int) {
    if(newValue > privateAge) privateAge = newValue
  }
}
