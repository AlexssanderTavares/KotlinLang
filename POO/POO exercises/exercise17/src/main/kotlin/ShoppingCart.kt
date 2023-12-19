open class ShoppingCart {
    var shopping = mutableListOf<Item>()

    fun showCart() {
       this.shopping.forEach{
           it.totalPerQuant = totalCalc(it.price, it.buyQuant)
           println("|Item Name: ${it.name}|Price: ${it.price}|Quantity: ${it.buyQuant}|Total: ${it.totalPerQuant} ") }
    }

    fun addItem(item:Item, quantity:Int) {
        shopping.add(item)
        item.buyQuant = quantity
        item.quantity -= item.buyQuant
    }

    fun totalCalc(price: Double, quant: Int) : Double {
        var total: Double = price * quant
        return total
    }
}