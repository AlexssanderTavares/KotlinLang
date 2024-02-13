import java.math.BigInteger

fun main() {

    val n1: Long = 5
    val n2: Long = 7
    val times: Int = 3

    megaMult(1, times,n1, n2)

    megaMult2(1,times, n1, n2)
}

tailrec fun megaMult(n: Int, times: Int, valueA: Long, valueB: Long) : BigInteger{ //n = initial number

    if(n <= times && n > 0){
                println("${(valueA + n).times(valueB + n)}")
        return megaMult(n + 1, times , (valueA + n), (valueB + n))
    }
    return BigInteger.ZERO
}

tailrec fun megaMult2(n: Int, times: Int, valueA: Long, valueB: Long) : BigInteger{ //n = initial number
    if(n <= times && n > 0){
        println("${(valueA + valueA).times(valueB + valueB)}")
        return megaMult2(n + 1, times , (valueA + valueA), (valueB + valueB))
    }
    return BigInteger.ZERO
}