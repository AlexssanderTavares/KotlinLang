class EspecialAccount(clientName:String, clientDoc: String, var creditLimit: Float) : CheckingAccount(clientName, clientDoc) {


    fun setLimit(limitValue:Float){
        creditLimit = limitValue
    }

    override fun withdraw(value: Float):Boolean {
        return if(this.balance - value >= this.creditLimit) {
            this.balance = this.balance - value
            true
        }else{
            println("ERROR: Especial Credit is not enough")
            false
        }
    }

    override fun describe() :String{
        return "|Client: ${this.clientName} | DOC: ${this.clientDoc} | Account Type: Especial Checking Account | Account Number: ${this.accountNum}| Balance: ${this.balance}"
    }
}


