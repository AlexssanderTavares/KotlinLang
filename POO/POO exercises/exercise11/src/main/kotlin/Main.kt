import java.util.*
fun main(){
    val read: Scanner = Scanner(System.`in`)

    //-------------------------------MANAGER CONTEXT------------------------------
    val mana1 = Manager()

    print("Enter manager name: ")
    mana1.setName()
    print("Enter ${mana1.name}'s wage value: ")
    mana1.setWage()

    println(mana1.describe())

    mana1.wageGrow()
    println(mana1.describe())



    //------------------------------PROGRAMMER CONTEXT----------------------------
    val prog1 = Programmer()

    print("Enter programmer name: ")
    prog1.setName()
    print("Enter ${prog1.name}'s wage value: ")
    prog1.setWage()

    println(prog1.describe())

    prog1.wageGrow()
    println(prog1.describe())


}