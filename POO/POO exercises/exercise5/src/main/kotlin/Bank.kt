import java.util.*;
class Bank(var bankName: String) {

    var clientName: String = ""
    var clientDoc: String = ""
    var clientBalance: Double = 0.00
    val read: Scanner = Scanner(System.`in`)


    fun withdraw() {
        println("${this.clientName} balance: ${this.clientBalance}")
        print("Withdraw value: ")
        var value: Double = read.nextDouble()
        clientBalance -= value
    }

    fun deposit(){
        print("Deposit value: ")
        var value: Double = read.nextDouble()
        this.clientBalance += value

    }

    fun transfer() : Double{
        println("${this.clientName} balance: ${this.clientBalance}")
        print("Transfer value: ")
        var value: Double = read.nextDouble()

        this.clientBalance -= value
        return value
    }
}