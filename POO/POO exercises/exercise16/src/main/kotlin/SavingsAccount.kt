class SavingsAccount(balance: Double) : Account(balance) {


    constructor(): this(balance = 0.0)

    override fun deposit(value: Double){
        this.balance += value
    }

    override fun withdraw(value: Double){
        if(this.balance > 0 ){
            this.balance -= value
        }else{
            println("ERROR: BALANCE OUT OF BOUNDS")
        }
    }

    override fun showBalance(): String {
        return "Balance: ${this.balance}"
    }
}