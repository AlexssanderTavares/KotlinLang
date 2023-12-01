fun main(){
    val newLampada1 = Lampada()

    //println(newLampada1.power(false))
    //println(newLampada1.setStatus)

    val newLampada2 = Lampada(true,120)
    //println(newLampada2.watts)

    //println(newLampada1.watts)

    val newLampada3 = Lampada(240)
    println(newLampada3.setStatus)
    println(newLampada3.watts)
    newLampada3.power(true)
    println(newLampada3.setStatus)

    val newLampada4 = Lampada(true)
    //println(newLampada4.watts)




}