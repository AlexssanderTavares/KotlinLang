data class User(var name: String, var isAdmin: Boolean) {

    fun describe() : String{
        return "Name: ${this.name} | Admin: ${this.isAdmin}"
    }
}