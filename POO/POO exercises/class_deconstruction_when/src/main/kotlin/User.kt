data class User(var name: String?, var age: Int?, var isAdmin: Boolean?) {

    constructor() : this(null,null,null)
    fun describe() :String{
        return "${this.name}|${this.age}|${this.isAdmin}"
    }

    fun showComps(){
        println(this.component1())
        println(this.component2())
        println(this.component3())
    }

    fun defAdmin(setAdmin: Boolean) {
        this.isAdmin = setAdmin
        println("${this.name} is now admin? ${this.isAdmin}")
    }
}