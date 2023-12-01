class User(name: String, var isAdmin: Boolean?){
    var email: String = "" //properties
    var name: String = ""

    lateinit var lastName: String
    //private keyword limits visibility of a variable, which will only be available inside the class

    companion object { //companion object holds the exclusive class properties and behavior that will only exist in class context, every objects will have properties inside this block



        //const keyword = make a variable with an immutable value in COMPILATION time (is constant before compilation)
        //val = make a variable with an immutable value in RUNTIME (is constant after compilation, during runtime)
        const val MAX_NAME_LENGTH = 8
        var count = 0
        fun resetCount(){
            count = 0
        }
    }
    init { // init executes actions following instructions in its body when the class is instantiated in an object
        count++

        this.name = verify(name, MAX_NAME_LENGTH)
        println("New User created! Hello $name") // it runs after default constructor
        println(count)
    }
    constructor() : this(name = "", isAdmin = null)


    fun describe(){
        println("Email: $email | Name: $name")
    }

    fun output() = println("My name is $name $lastName | Admin? ${this.isAdmin}")
    fun setUpper():String {
        return name.uppercase()
    }

    fun verify(name: String, size: Int) : String{
        if (name.length > size){
            this.name = ""
            return this.name
        } else{
            return this.name
        }
    }
}