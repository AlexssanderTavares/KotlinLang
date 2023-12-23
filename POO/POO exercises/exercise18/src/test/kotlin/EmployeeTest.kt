class EmployeeTest(name:String, lastName:String, wage:Double) : Employee(name, lastName, wage){

    constructor() : this(name = "", lastName = "", wage = 0.0)
}

fun main(){
    val emp1 = EmployeeTest()
    val emp2 = EmployeeTest("Alexssander", "Tavares", 1500.00 )

    emp1.newWage(1800.00)
    emp1.setName("Lindiane","Tavares")

    println(emp1.describe())
    println(emp2.describe())

    emp1.wageIncrease(0.10)
    emp2.wageIncrease(0.10)

    println(emp1.describe())
    println(emp2.describe())

}