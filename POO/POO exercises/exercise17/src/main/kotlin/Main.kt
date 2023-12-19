fun main(){
    println("Client Context")
    val client1 = Client("Alexssander", "4411122235")
    println("--------------------------------------\n")

    println("Item creation context")
    val mouse1 = Item("Redragon Viper", 400.00, 100)
    val mouse2 = Item("Razer Dethadder", 450.00, 100)
    val mouse3 = Item("Logitech G705", 460.00, 100)
    val headset1 = Item("Redragon Zeus H510", 400.00, 100)
    val headset2 = Item("Razer Kraken", 800.00, 100)
    val headset3 = Item("Logitech G29", 600.00, 100)
    println("--------------------------------------\n")

    println("Shopping Cart context")

    val cart1 = ShoppingCart()
    cart1.addItem(mouse1, 5)
    cart1.addItem(headset2, 10)
    cart1.addItem(headset1, 20)
    cart1.addItem(headset3, 30)
    println(cart1.showCart())


    println("--------------------------------------\n")

    println("Invoice generation context")
    var invoice = Invoice(client1,cart1)

    println("Storage quantity updates")
    mouse1.showStrQuant()
    mouse2.showStrQuant()
    mouse3.showStrQuant()
    headset1.showStrQuant()
    headset2.showStrQuant()
    headset3.showStrQuant()
    println("--------------------------------------\n")

}