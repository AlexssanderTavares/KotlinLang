open class CurrentAccount(override var balance: Double) : Account(), Tributes {

    lateinit var signed: LifeInsurance
    init{
        this.balance = this.tributeCalc()
    }

    companion object{
       const val TRIBUTERATE: Double = 0.01
    }

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

    override fun tributeCalc(): Double {
        if(balance > 0) {
            val tributeValue = balance * TRIBUTERATE
            val result = balance - tributeValue
            return result
        }else{
            return 0.0
        }
    }

}
