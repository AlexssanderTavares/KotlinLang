fun main() {
    val client1 = Client("Alexssander", "44444444488", 27)
    val client2 = Client("Lindiane", "77777777744", 23)

    println(client1.describe())
    println(client2.describe())

    val account1 = CheckingAccount(client2.name, client2.doc)
    val account2 = EspecialAccount(client1.name, client1.doc, -5000.0F)
    println("")
    println("----------------------CONTEXT 1: Checking Account Tests----------------------------------")
    println("")

    account1.deposit(11000.0F)
    println(account1.describe())


    account1.withdraw(1000.0F)
    println(account1.describe())

    println("")
    println("-------------------CONTEXT 2: Especial Checking Account Tests---------------------------")
    println("")

    account2.deposit(11000.0F)
    println(account2.describe())

    account2.withdraw(1000.0F)
    println(account2.describe())

    account2.withdraw(15000.0F)
    println(account2.describe())

    account2.withdraw(16000.0F)
    println(account2.describe())

    println("")
    println("--------------------------------CONTEXT 3: Transfer--------------------------------------")
    println("")

    account1.transfer(6000.0F, account2)
    println(account1.describe())
    println(account2.describe())

    account2.transfer(6000.0F,account1)
    println(account1.describe())
    println(account2.describe())
}