abstract class Account {

    abstract var balance: Double

    abstract fun withdraw(value: Double)
    abstract fun deposit(value: Double)
    abstract fun showBalance() : String

}


