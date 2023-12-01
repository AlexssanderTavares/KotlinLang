/*EASY 9- MAKE A PROGRAM THAT RECEIVES FIFTEEN PEOPLES AGE AND THEN CALCULATE AND SHOW THE QUANTITY OF PEOPLES WITH AGE
*         EQUAL OR BELOW 18 YEARS.
*
* INTERMEDIATE 10 - MAKE A PROGRAM THAT RECEIVES THE AGE OF FIFTEEN PEOPLE AND THEN CALCULATE AND SHOW:
*                 A) THE QUANTITY OF PEOPLE IN EACH AGE RANGE
*                 B) THE PERCENT OF PEOPLES IN THE FIRST AND LAST AGE RANGE, BASED ON THE TOTAL OF PEOPLES
*
*                   AGE RANGES:
*                   * UNTIL 15 YEARS
*                   * 16 TO 30 YEARS
*                   * 31 TO 45 YEARS
*                   * 46 TO 60 YEARS
*                   * ABOVE 61 YEARS
* */

import java.math.MathContext
import java.util.*;
import java.text.DecimalFormat;
import kotlin.math.round

fun main(){

    val nameList = Array(16){"n = $it"};
    val ageList = IntArray(16);
    val read = Scanner(System.`in`);
    var legals: Int = 0;
    var ageA: Int = 0;
    var ageB: Int = 0;
    var ageC: Int = 0;
    var ageD: Int = 0;
    var ageE: Int = 0;
    val df = DecimalFormat("#.##");

    for(counter in 0..5){
        print("Enter name: ");
        nameList[counter] = read.next();
        print("Enter ${nameList[counter]}'s age: ");
        ageList[counter] = read.nextInt();
    }

    for(age in ageList){

        if(age >= 18 ){
            legals += 1;
        }

        if(age <= 15){
            ageA += 1;
        } else if(age > 15 && age <= 30 ){
            ageB += 1;
        } else if(age > 30 && age <= 45){
            ageC += 1;
        } else if(age > 46 && age <= 60){
            ageD += 1;
        } else{
            ageE += 1;
        }

    }
    println("----------------------------------------");
    println("Total of peoples: ${ageList.size}");
    println("Total of Peoples with legal age: $legals"); //END OF EXERCISE 9
    println("Peoples with age until 15 years: $ageA | Represents: ${df.format(((ageA * 100) / ageList.size)).toDouble()}");
    println("Peoples with age between 16 to 30 years: $ageB | Represents: ${df.format(((ageB * 100) / ageList.size)).toDouble()}");
    println("Peoples with age between 31 to 45 years: $ageC | Represents: ${df.format(((ageC * 100) / ageList.size)).toDouble()}");
    println("Peoples with age between 46 to 60 years: $ageD | Represents: ${df.format(((ageD * 100) / ageList.size)).toDouble()}");
    println("Peoples above 60 years: $ageE | Represents: ${df.format(((ageE * 100) / ageList.size)).toDouble()}");
    println("----------------------------------------");
}



