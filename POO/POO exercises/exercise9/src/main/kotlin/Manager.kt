class Manager(name:String, wage:Float, var dep: String) : Employee(name, wage){

    init{
        println("New manager created")
        println(describe())
    }
    constructor():this("",0F,"")

    override fun describe():String{
        return "|Employee Name: ${this.name} | Job: Manager | Department: ${this.dep} | Wage: ${this.wage}"
    }
}