

import java.util.*;

fun main(){
    val read = Scanner(System.`in`);

    print("Enter day: ");
    val userDay: Int = read.nextInt();
    print("Enter month: ");
    val userMonth: Int = read.nextInt();
    print("Enter year: ");
    val userYear: Int = read.nextInt();

    val newDate: UserDate = UserDate(userDay, userMonth, userYear)
    println("|${newDate.day}|${newDate.month}|${newDate.year}|")
}