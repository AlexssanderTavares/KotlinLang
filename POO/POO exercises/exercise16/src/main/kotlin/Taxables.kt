open class Taxables {

    var totalIncome: Double = 0.0

    fun totalIncomeCalc(value:Double){
        totalIncome = totalIncome + value
    }

    fun showTotalIncomes(){
        println("Total incomes: ${this.totalIncome}")
    }
}