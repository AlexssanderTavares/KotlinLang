/*
    Create a class called "People" that own attributes to store name, age and job. Implement methods for calculating
    the age in leap years and show information of the people
*/


fun main(){

    val ppl1 = People()

    ppl1.name = "Alexssander"
    ppl1.age = 27
    ppl1.job = "Gatekeeper"

    println("|${ppl1.name}|${ppl1.age} years|${ppl1.job}|${ppl1.leapYear()}")

}