class Triangle(var heigth: Double, var base: Double) {



    init{
        if(verify1(heigth) != 0.0  && verify2(base) != 0.0){
            println("Triangle created successful")
        }else{
            println("Not a valid triangle, sizes with values lower than 0 is not allowed")
        }
    }
    fun verify1(arg1: Double) : Double {
        if(arg1 <= 0) {
            return 0.0
        } else{
            this.heigth = arg1
            return this.heigth
        }
    }



    fun verify2(arg2: Double) : Double{
        if(arg2 <= 0){
            return 0.0
        }else{
            this.base = arg2
            return this.base
        }
    }

    fun area() : Double{
          val area: Double = (heigth* base) / 2
          return area
    }
}