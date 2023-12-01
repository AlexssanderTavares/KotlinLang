/*
    Implement a class called "Bank" that represents a financial institution. This class must contains methods to register
    new clients, open bank accounts, and realize operations like withdrawals, deposits and transfers.
*/

fun main(){
    val bradesco = Bank("Bradesco")

    val itau = Bank("Itau")

    val client1 = Client("Alexssander", "46250287876")

    bradesco.clientName = client1.name
    bradesco.clientDoc = client1.doc

    itau.clientName = client1.name
    itau.clientDoc = client1.doc

    println("Make a deposit to ${bradesco.bankName}")
    bradesco.deposit()

    println("|${bradesco.clientName} balance: ${bradesco.clientBalance}|")

    println("Make a withdraw in ${client1.name} ${bradesco.bankName} account")
    bradesco.withdraw()

    println("|${bradesco.clientName} balance: ${bradesco.clientBalance}|")

    println("Make a transfer to ${itau.bankName}")

    itau.clientBalance += bradesco.transfer()

    println("|${bradesco.bankName.uppercase()}| ${bradesco.clientName} balance: ${bradesco.clientBalance}|")
    println("|${itau.bankName.uppercase()}| ${itau.clientName} balance: ${itau.clientBalance}|")

}