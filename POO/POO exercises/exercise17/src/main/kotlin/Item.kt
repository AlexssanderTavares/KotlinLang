class Item(var name:String, var price: Double, var quantity: Long) {

    var buyQuant: Int = 0
    var totalPerQuant: Double = 0.0

    init {
        println("| Name: ${this.name} | Price: ${this.price} | Storage Quantity: ${this.quantity}")
    }

    fun showStrQuant() {
        println(this.quantity)
    }




}