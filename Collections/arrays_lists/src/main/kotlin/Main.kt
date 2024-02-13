fun main() {
    println("FIX LIST")
    val items = arrayOf(1,2,3,4,5,6)
    items.forEach {
        println(it)
    }
    //FIX LIST
    val users = arrayOf<User?>(
        User("Alexssander",true),
        User("Lipe",false)
    )
    users.forEach {println(it?.name + "|" + it?.isAdmin)}

    users.plus(User("Lindiane",false))
    users.forEach {println(it)}

    println(users[0])
    println("----------------------------------------")

    println("DYNAMIC LIST - Only Reading")
    //DYNAMIC LIST  - Only Reading
    val users2 = listOf<User?>(
        User("Alexssander",true),
        User("Lipe",false),
        null
    )

    println(users2.first())
    println(users2.last())

    println(users2.isEmpty())
    println(users2.isNotEmpty())
    println(users2.isNullOrEmpty())
    println("----------------------------------------")

    println("DYNAMIC MUTABLE LIST - READING AND WRITING")
    //DYNAMIC MUTABLE LIST - Reading and writing
    val users3 = mutableListOf<User?>(
        User("Alexssander",true),
        User("Lipe",false),
        null
    )

    //updating
    users3[1] = User("Dédé",false)
    println("----------------------------------------")
    //adding
    users3.add(User("Antonio",false))
    users3.forEach{println(it?.name + "|" + it?.isAdmin)}

    //delete
    println("----------------------------------------")
    users3.remove(users3[2])
    users3.forEach{println(it?.name + "|" + it?.isAdmin)}

    users3.removeAt(2)
    users3.forEach{println(it?.name + "|" + it?.isAdmin)}
    println("----------------------------------------")
    println("Combinating Lists")
    //COMBINATING LISTS

    //combination 1
    println("THIS IS THE POINT")
    val a = mutableListOf("Alexssander","Lucas")
    val b = mutableListOf("Joao", "Peter" , "Lindiane")

    b.filterTo(a, { it.contains("a") })
    println(a)

    //combination 2 - MATRIX
    val c = listOf("A","B")
    val d = listOf("C", "D")
    val all = listOf(c, d)
    println(all) //this will return 2 lists inside a list(all)
    println(all.flatten()) //this will take the inner elements of each list and return each element inside the main list(all)
    println("----------------------------------------")
    //filter

    val filtered = users.filter { user ->
        //user?.isAdmin ?: true
        user?.name?.lowercase()?.contains("ex") ?: true
    }

    filtered.forEach { println(it?.name)}

}




