fun main(){
    val user1 = User()
    val user2 = User("Alexssander",27, false)

    println(user2.describe())

    user1.name = "Lindiane"
    user1.age = 23
    user1.defAdmin(true)

    println(user1.describe())
    user2.defAdmin(true)
    println(user2.describe())

    println("------------------------------------------------------------------------------")
    user1.showComps()
    user2.showComps()
    println("------------------------------------------------------------------------------")


    when{
        user2.isAdmin == true -> println("${user2.name} is allowed")
        else -> println("User not allowed")
    }

    when{
        user1.isAdmin == true -> println("${user1.name} is allowed")
        else -> println("User not allowed")
    }

    println("------------------------------------------------------------------------------")

    val (name1,age1,isAdmin1) = user1

    println("$name1 | $age1 | $isAdmin1")
}