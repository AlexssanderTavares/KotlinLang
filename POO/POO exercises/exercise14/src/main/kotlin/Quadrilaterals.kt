interface Quadrilaterals{
    fun areaCalc() : Double
}

class Square(var side: Double) : Quadrilaterals{

    override fun areaCalc() : Double{
        val result = this.side * this.side
        return result
    }
}

class Rectangle(var sideA: Double, var sideB: Double) : Quadrilaterals{

    override fun areaCalc() : Double{
        val result = this.sideA * this.sideB
        return result
    }
}