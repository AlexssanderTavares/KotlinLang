import kotlin.random.Random

open class CheckingAccount(var clientName: String, var clientDoc: String) {
    protected var balance: Float = 0F
    var accountNum: String = setAccountNum()

    init{
        println("New Checking Account created")
        println(this.describe())
    }
    fun setAccountNum() : String{
        val randomValue = List(8){Random.nextInt(0,9)}
        accountNum = "${randomValue[0]}${randomValue[1]}${randomValue[2]}${randomValue[3]}${randomValue[4]}${randomValue[5]}${randomValue[6]}-${randomValue[7]}"
        return accountNum
    }
    fun deposit(value:Float){
        balance = balance + value
    }

    open fun withdraw(value:Float):Boolean{
        return if(this.balance > 0) {
            balance = balance - value
            println("Withdraw value: $value Success")
            true
        }else{
            println("Balance is not enough")
            false
        }
    }

    open fun describe():String{
        return "|Client: ${this.clientName} | DOC: ${this.clientDoc} | Account Type: Checking Account | Account Number: ${this.accountNum} | Balance: ${this.balance}"
    }

    fun transfer(value:Float, account: CheckingAccount):Boolean{
        return if(this.balance > 0) {
            balance = balance - value
            account.balance = account.balance + value
            println("Transfer $value to ${account.clientName} Success")
            true
        }else{
            println("ERROR: Balance is not enough")
            false
        }
    }
}