/*EASY 11 - WRITE AN APPLICATION THAT RECEIVES AN INTEGER AND SHOW PAIR AND ODD NUMBERS
*           (SEPARATED), FROM 1 UNTIL THIS INTEGER */

import java.util.*;
fun main(){
    val read = Scanner(System.`in`);
    print("Enter a number: ");
    var userNum: Int = read.nextInt();
    var counter1: Int = 1;
    var counter2: Int = 1;
    println("----------------Pairs---------------");
    while(counter1 <= userNum){
        if(counter1 % 2 == 0){
            println(counter1);
        }
        counter1++;

    }
    println("----------------Odds----------------")
    while(counter2 <= userNum){
        if(counter2 % 2 == 1){
            println(counter2);
        }
        counter2++;
    }

}