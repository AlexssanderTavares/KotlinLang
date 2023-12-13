class LifeInsurance(var signUp:Boolean, override var balance: Double) : CurrentAccount(balance), Tributes{

    val FIXRATE: Double = 42.0
    init{
        if(this.signUp) {
            this.balance = this.tributeCalc()
        }else{
            println("Life Insurance not signed")
        }
    }
    override fun tributeCalc(): Double {
        if(balance > 0) {
            val result = balance - FIXRATE
            return result
        }else{
            return 0.0
        }
    }
}