import java.util.*;
open class Employee(var name:String, protected var wage: Float) {
    val read: Scanner = Scanner(System.`in`)

    fun sName(){
        this.name = read.next()
    }

    fun sWage(){
        this.wage = read.nextFloat()
    }

    fun gName():String{
        return this.name
    }
    fun gWage():Float{
        return this.wage
    }
    open fun describe():String{
        return "|Employee Name: ${this.name} | Wage: ${this.wage}"
    }
}