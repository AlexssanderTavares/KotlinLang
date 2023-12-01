class VIPTicket() : Ticket() {
    val additionalPrice: Double = 30.0

    fun vipPrice() : String{
        val finalValue: Double = price + additionalPrice
        return "VIP Ticket Price: $finalValue"
    }

}