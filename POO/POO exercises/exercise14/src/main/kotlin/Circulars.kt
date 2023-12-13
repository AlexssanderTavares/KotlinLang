import kotlin.math.pow

interface Circulars {
    val PI: Double
        get() = 3.14

    fun areaCalc() : Double
}

class Circle(var radius: Double) : Circulars{

    override fun areaCalc() : Double{
        val result = super.PI * (this.radius.pow(2))
        return result
    }
}

class Ellipse(var radiusA: Double, var radiusB: Double) : Circulars{

    override fun areaCalc(): Double {
        val result = super.PI * (this.radiusA * this.radiusB)
        return result
    }
}