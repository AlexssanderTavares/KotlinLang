class Retangle(var heigth: Double, var length: Double) {


    //constructor(heigth: Int , length: Int): this()
    fun area() : Double{
        val area: Double = heigth * length
        return area
    }

    fun perimeter() : Double{
        val perimeter: Double = (heigth + heigth) + (length + length)
        return perimeter
    }
}