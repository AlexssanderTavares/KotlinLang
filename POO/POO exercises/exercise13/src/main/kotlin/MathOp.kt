abstract class MathOp {
    abstract fun calc(num1:Int,num2:Int) : Int
}

class Sum : MathOp(){
    override fun calc(num1:Int,num2:Int) : Int{
        val result = num1 + num2
        return result
    }

    fun calc(args: IntArray):Int{
        val result = args.sum()
        return result
    }
}

class Sub : MathOp(){

    override fun calc(num1:Int,num2:Int):Int{
        val result = num1 - num2
        return result
    }
}

class Mult : MathOp(){

    override fun calc(num1:Int,num2:Int):Int{
        val result = num1 * num2
        return result
    }
}

class Split : MathOp(){

    override fun calc(num1:Int,num2:Int):Int{
        val result = num1 / num2
        return result
    }
}