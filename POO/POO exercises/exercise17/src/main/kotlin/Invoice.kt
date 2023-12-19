class Invoice(var client: Client, cart: ShoppingCart) : ShoppingCart(){
    var subtotal: Double = 0.0

    init{
        subtotal = this.subtotal(cart)
        println("Invoice generated\n")
        println("| Client: ${this.client.name} | Doc: ${this.client.doc}")
        cart.showCart()
        println("Total to pay: ${this.subtotal}")
    }

    fun subtotal(cart: ShoppingCart) : Double {

        for(price in cart.shopping){
           subtotal += price.totalPerQuant
        }
        return subtotal
    }

}