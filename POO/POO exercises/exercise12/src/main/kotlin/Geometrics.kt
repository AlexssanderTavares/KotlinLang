import kotlin.math.pow
abstract class Geometrics {
    protected val PI: Double = 3.14

    abstract fun length() : Double

    abstract fun area() : Double
}

class Triangle(var base: Double, var height: Double) : Geometrics(){

    constructor() : this(0.0,0.0)

    override fun length():Double{
        val length: Double = this.base + this.height + this.height
        return length
    }

    override fun area() : Double{
        val area: Double = this.base * this.height
        return area
    }
}

class Circle(var radius: Double) : Geometrics(){

    constructor() : this(0.0)

    override fun length() : Double{
        val length: Double = (2 * PI) * this.radius
        return length
    }

    override fun area() : Double {
        val area: Double = PI * (this.radius.pow(2))
        return area
    }
}

class Square(var side: Double) : Geometrics(){

    constructor() : this(0.0)

    override fun length() : Double {
        val length: Double = this.side * 4
        return length
    }

    override fun area() : Double {
        val area: Double = this.side * this.side
        return area
    }


}