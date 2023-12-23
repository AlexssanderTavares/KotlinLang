fun main(){
    val emp1 = Employee()
    val emp2 = Employee("Alexssander", "Tavares", 1500.00 )

    emp1.newWage(1800.00)
    emp1.setName("Lindiane","Tavares")

    println(emp1.describe())
    println(emp2.describe())

    emp1.wageIncrease(0.10)
    emp2.wageIncrease(0.10)

    println(emp1.describe())
    println(emp2.describe())
}