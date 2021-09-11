

package LSP
object Test {

  val withdraw: (Account, Double) => String = (account: Account, amount:Double)=>{
    account.amount = account.amount - amount
    "ALERT: You've withdrawn Rs. " + amount + " Available Bal Rs.  " + account.amount
  }


  val deposit: (Account, Double) => String = (account: Account, amount:Double)=>{
    account.amount = account.amount + amount
    "UPDATE: Rs. " + amount + " has been deposited into your account. Avl Bal INR " + account.amount
  }


  def main(args: Array[String]): Unit = {

    val savingAccount = new AccountSaving("Shashikant Tanti", 4500.45)
    val currentAccount = new AccountCurrent("Sankata Jee", 8000.66)

    // The Liskov Substitution Principle states that subclasses should be substitutable for their base classes.

    Printer(withdraw(savingAccount, 1000)).printMessage()
    Printer(withdraw(currentAccount, 500)).printMessage()

    Printer(deposit(savingAccount, 100)).printMessage()

  }
}


