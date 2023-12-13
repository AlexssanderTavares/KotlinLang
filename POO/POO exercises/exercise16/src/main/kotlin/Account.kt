abstract class Account(var balance: Double) {


    abstract fun withdraw(value: Double)
    abstract fun deposit(value: Double)
    abstract fun showBalance() : String

}

class Teste : Account(){
    this.balance = 0.0
}