open class Employee(var name: String, var lastName: String, var wage: Double) {

    constructor() : this(name= "", lastName = "", wage = 0.0)

    fun setName(n:String,ln:String){
        this.name = n
        this.lastName = ln
    }

    fun newWage(n:Double){
        this.wage = n
    }

    fun describe() : String{
        return "|Name: ${this.name} | Last name: ${this.lastName} | Month wage: ${this.wage}|"
    }

    fun wageIncrease(percent:Double) {
        var increaseValue = this.wage * percent
        this.wage = this.wage + increaseValue
    }
}