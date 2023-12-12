fun main(){
    val sum = Sum()
    val sub = Sub()
    val mult = Mult()
    val split = Split()
    //Arrays
    val lista1: IntArray = intArrayOf(4, 8, 9, 6, 3, 7, 8)//IntArray and Array<Int> is different between then
    val lista2: DoubleArray = doubleArrayOf(4.5, 8.9, 7.4)
    val lista3: BooleanArray = booleanArrayOf(true, false, true)
    val lista4: FloatArray = floatArrayOf(4.2F, 5.3F, 7.4F)
    val lista5: CharArray = charArrayOf('t','c','k')
    val lista6 = arrayOf("text1","text2","text3")
    val lista7 = arrayOf(1,2,4,5,"text",true, null) //sorted type array, every index has a type
    val lista8 = arrayOf(4,8,9,6,4,7,2+2) //Kotlin automatically set an entire array of integers as IntArray




    println(sum.calc(lista1))

    println(sum.calc(lista8.toIntArray())) //casting values of a sorted type array into a IntArray, this casting is only possible if all values is of the same type

    println(sub.calc(4,2))
    println(mult.calc(5,4))
    println(split.calc(20,4))



}