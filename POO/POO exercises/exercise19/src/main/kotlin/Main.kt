fun main(){
    val box = IntegerSet()


    for(num: Int in 0..100){
        box.intBox.add(num)
    }




    box.isTrue(box.intBox)
    box.boolBox1.forEach { println(it) }
    //println(box.intBox.forEach(::println))


}