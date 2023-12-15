class IncomeTaxManager : Taxables(){
    var total:Double = 0.0

    fun tax(tax:Taxables){
        var inssTax: Double = tax.totalIncome * 0.12
        var incomeTax: Double = (tax.totalIncome - inssTax) * 0.15
        this.total = tax.totalIncome - inssTax - incomeTax

    }

    fun showTotal(){
        println("Total With Tributes: ${this.total}")
    }



}