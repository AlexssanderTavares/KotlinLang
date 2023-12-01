class Seller(name:String,wage:Float, var commissionPercent: Float = 0F) : Employee(name, wage) {
    var totalSellValue:Float = 0F

    constructor() : this("",0F,0F)

    init{
        println("New seller created")
        println(describe())
    }

    fun setSellValue(sellValue:Float){
        totalSellValue = sellValue
    }

    fun wageCalc() : Float{
        val commission: Float = this.totalSellValue * this.commissionPercent
        val finalWage: Float = this.wage + commission
        return finalWage
    }

    override fun describe():String{
        return "|Employee Name: ${this.name} | Job: Seller | Wage: ${this.wage} | Wage with Commission: ${wageCalc()} | Commission Percent: ${this.commissionPercent}"
    }
}