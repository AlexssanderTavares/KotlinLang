fun main(){
    val users = listOf(
        User("Alexssander", true),
        User("Lindiane", false)

    )

    users.forEach{ println(it.describe()) }

    val users2 = setOf( //don't allow the same item inside the set, you can write but is inaccessible
        "Tiago",
        "Alex",
        "Lindiane",
        "Alex"
    )

    users2.forEach { println(it) }

    val users3 = mutableSetOf( //don't allow the same item inside the set, you can write but is inaccessible
        "Tiago",
        "Alex",
        "Lindiane",
        "Alex"
    )

    users3.add("Donovan")
    users3.remove("Alex")

    users3.forEach { println(it) }

//FUNCTIONAL


    calc(4,5, ::sum)
    calc(6,3, ::minus)

    calc(5,5, { a, b -> a * b})

}

fun sum(a: Int, b: Int) : Int{
    return a + b
}

fun minus(a: Int, b: Int) : Int{
    return a - b
}

fun mult(a: Int, b: Int) : Int{
    return a * b
}

fun divide(a: Int, b: Int) : Int{
    return a / b
}

fun calc(a: Int, b: Int, operation: (Int, Int) -> Int) {
    val result = operation(a,b)
    println("RESULT: $result")
}