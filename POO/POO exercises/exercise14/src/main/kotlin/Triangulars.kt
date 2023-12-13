interface Triangulars {

    fun areaCalc() : Double
}

class Triangle(var base: Double, var height: Double) : Triangulars{

    override fun areaCalc(): Double {
        val result = this.base * this.height
        return result
    }
}
