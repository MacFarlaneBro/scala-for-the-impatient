/*
 Though I am aware that double are singularly inappropriate for holding monetary values I decided
 that for the purposes of simplicity I would allow their use in this dummy class.
 */
class BankAccount {
  private var balance = 0.0

  def deposit(depositAmount: Double){
    balance += depositAmount
  }

  def withdraw(withdrawlAmount: Double){
    if(withdrawlAmount <= balance)
      balance -= withdrawlAmount
    else
      print("Insufficient funds!")
  }
}
