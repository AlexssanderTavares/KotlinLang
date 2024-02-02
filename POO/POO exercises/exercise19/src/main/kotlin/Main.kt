fun main(){
    val box = IntegerSet()

    println("Function isTrue context")

    box.isTrue(box.intBox)
    box.boolBox1.forEach { println(it) }

    println("---------------------------")
    println(box.unite())
    println("Adding numbers context")

    for(num in 0..100){
        box.intBox.add(num)
    }

    println("---------------------------")


    box.describe()


    println("Function isTrue context")

    box.isTrue(box.intBox)
    box.boolBox1.forEach { println(it) }

    println("---------------------------")

    //println(box.unite())

}