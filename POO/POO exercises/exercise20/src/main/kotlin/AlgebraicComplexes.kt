class AlgebraicComplexes(var real: Int, var imaginary: Int) : Complex {
    var z = real + imaginary

    constructor() : this(real = 0, imaginary = 0)
    constructor(real: Int): this(real = real, imaginary = 0)

    override fun sum(complex1: AlgebraicComplexes, complex2: AlgebraicComplexes) : Int {
        val z1 = complex1.real + complex1.imaginary
        val z2 = complex2.real + complex2.imaginary
        val result = z1 + z2
        return result
    }

    override fun subt(complex1: AlgebraicComplexes, complex2: AlgebraicComplexes) : Int {
        val z1 = complex1.real + complex1.imaginary
        val z2 = complex2.real + complex2.imaginary
        val result = z1 - z2
        return result
    }

    override fun mult(complex1: AlgebraicComplexes, complex2: AlgebraicComplexes): Int {
        val z1 = complex1.real + complex1.imaginary
        val z2 = complex2.real + complex2.imaginary
        val result = z1 * z2
        return result
    }
    override fun div(complex1: AlgebraicComplexes, complex2: AlgebraicComplexes): Int {
        TODO("DIVISION FORMULA")
    }

    fun inverse(complex: AlgebraicComplexes) : Any {
        val conversion1 = complex.z.toString()
        if(conversion1.contains("+")){
            val inverse: Int = complex.real - complex.imaginary
            return inverse
        }else if(conversion1.contains("-")){
            val inverse: Int = complex.real + complex.imaginary
            return inverse
        }else{
            return 0
        }
    }
}