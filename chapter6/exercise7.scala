object Suits extends Enumeration {

  val spade = Value("♠")
  val diamond = Value("♦")
  val club = Value("♣")
  val heart = Value("♥")

  def isRed(suit: Suits): Boolean = {
    if(suit.value == "♦" ||
      suit.value == "♥") return true

    false
  }

}
