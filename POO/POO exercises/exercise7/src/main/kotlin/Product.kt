class Product(var name: String, var price: Double, var quant: Int) {
    init{
        println(verifyAvailability())
    }

    fun verifyAvailability(): String{
        return if(this.quant != 0){
            "Product available"
        }else {
            "Product not available"
        }
    }
    fun storageValue(): Double{
        val value = this.quant * this.price
        return value
    }
}