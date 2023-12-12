import java.util.*

abstract class Employee {
    var name:String = ""
    var wage:Double = 0.0

    val read:Scanner = Scanner(System.`in`)


    abstract fun setName()

    abstract fun setWage()

    abstract fun wageGrow() : Double

    abstract fun describe():String
}

class Manager : Employee(){
    init{
        println("New Manager created")
    }
    override fun setName(){
        name = read.next()
    }

    override fun setWage(){
        wage = read.nextDouble()
    }

    override fun wageGrow() : Double {
        wage = wage + (wage * 0.1)
        return wage
    }

    override fun describe() : String{
        return "|Manager: ${this.name} | Wage: ${this.wage}|"
    }


}

class Programmer : Employee(){
    init{
        println("New Programmer created")
    }
    override fun setName(){
        name = read.next()
    }

    override fun setWage(){
        wage = read.nextDouble()
    }

    override fun wageGrow() : Double {
        wage = wage + (wage * 0.2)
        return wage
    }

    override fun describe() : String{
        return "|Programmer: ${this.name} | Wage: ${this.wage}|"
    }
}