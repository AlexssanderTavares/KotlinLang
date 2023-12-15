fun main(){
    val taxables = Taxables()

    taxables.totalIncomeCalc(3000.0)
    taxables.totalIncomeCalc(1000.0)
    taxables.showTotalIncomes()

    val ITM = IncomeTaxManager()

    ITM.tax(taxables)
    ITM.showTotal()
}