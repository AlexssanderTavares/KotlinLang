class Circle(var radius: Double) {


    constructor(radius: Int) : this()
    companion object {
        const val PI: Double = 3.14
    }

    constructor(): this(0.0)

    fun area(): Double{
        val area: Double = PI * (radius * radius)
        return area
    }

    fun perimeter(): Double{
        val c: Double = 2 * radius * PI
        return c
    }
}