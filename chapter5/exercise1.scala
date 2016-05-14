class Counter {
  private var value = 0
  def increment() =  { if(value != Int.MaxValue) value += 1 else print("At max value!") }
  def current() = value
}
