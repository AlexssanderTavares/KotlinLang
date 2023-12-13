fun main(){


    println("Saving Account context")
    val savingsAccount = SavingsAccount()
    savingsAccount.deposit(1000.0)
    println(savingsAccount.showBalance())
    savingsAccount.withdraw(200.0)
    println(savingsAccount.showBalance())
    savingsAccount.deposit(250.0)
    println(savingsAccount.showBalance())

    println("")
    println("Current Account context")
    val currentAccount = CurrentAccount(1000.0)
    currentAccount.deposit(1000.0)
    println(currentAccount.showBalance())
    savingsAccount.withdraw(190.0)
    println(currentAccount.showBalance())

    println("")
    println("Life Insurance context")
    currentAccount.signed = LifeInsurance(true, currentAccount.balance)
    println(currentAccount.signed.showBalance())
}
