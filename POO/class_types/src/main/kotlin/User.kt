data class User(var name: String, var isAdmin: Boolean) {

    fun describe(): String = "Meu nome é $name"

    fun nameLength() = name.length
}