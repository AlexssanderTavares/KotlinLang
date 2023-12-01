fun main(){

    val userA = User("Alex", true) //Class inicialization, it instance the Class definition inside this variable (this variable is seen as a new object)
    val userB = User()

    userA.email = "alexssander.santos2@gmail.com" // accessing and filling User Class property
    userA.name = "Alexssander"
    userA.lastName = "Tavares"
    userA.describe()

    userB.name = "lindiane"
    println(userB.setUpper())

    val movieA = Movie("Ilha do Medo") //constructor method with args defining property
    println(movieA.movieName)

    val register = Register(userA.email, userA.name, "123456")
    User.resetCount()

    login(userA)
    println(Database.user?.name)
    login(userB)
    println(Database.user?.name)

    userA.output()

}

fun login(user: User){
    Database.user = user
}



/* In OOP, every CLASS is a definition of one or more objects. It's a model of characteristics where each object will
carry, representing this CLASS

Kotlin set imports of classes automatically as default so you don't need to import it manually if they are in the same
folder

 */