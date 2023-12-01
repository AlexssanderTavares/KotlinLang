fun main(){
    val manager1 = Manager("Alexssander",2500.0F,"Grains and powders")
    val seller1 = Seller("Lindiane",1800.0F,0.3F)

    seller1.setSellValue(20000F)

    println(manager1.describe())
    println(seller1.describe())

    manager1.sName()
    manager1.sWage()

    println(manager1.gName())
    println(manager1.gWage())
    println(manager1.describe())
}