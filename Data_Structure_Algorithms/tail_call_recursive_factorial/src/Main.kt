import java.math.BigInteger

fun main() {
    val userNum: Long = 100000

    print("Factorial of $userNum: ")
    println(factorial(userNum))

}


tailrec fun factorial(n:Long, accum: BigInteger = BigInteger.valueOf(1)) : BigInteger {
    val soFar = accum.times(n.toBigInteger())
    return if(BigInteger.valueOf(n) == BigInteger.valueOf(1) && BigInteger.valueOf(n) != BigInteger.ZERO){
        soFar
    } else {
        factorial(n - 1, soFar)
    }
}
