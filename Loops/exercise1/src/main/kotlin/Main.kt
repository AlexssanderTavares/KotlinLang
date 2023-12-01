import java.util.*

/*INTERMEDIATE 5 - MAKE A PROGRAM THAT READS THREE VALUES(A,B,C) AND SHOW THEM IN SAME READING ORDER.
                   THEN, SHOW THEM IN ASCENDING AND DESCENDING ORDER.
 */
fun main(){
    val read = Scanner(System.`in`);
    print("Enter a number: ");
    val num1: Int = read.nextInt();
    print("Enter another number: ");
    val num2: Int = read.nextInt();
    print("Enter another number: ");
    val num3: Int = read.nextInt();

    println("Enter order: $num1 | $num2 | $num3");
    println("-----------------------------------------------")
        if (num1 > num2 && num1 > num3) {
            if (num2 > num3) {
                println("Ascending order: $num3,$num2,$num1")
                println("Descending order: $num1,$num2,$num3")
            } else {
                println("Ascending order: $num2,$num3,$num1")
                println("Descending order: $num1,$num3,$num2")
            }
        } else if (num2 > num1 && num2 > num3) {
            if (num1 > num3) {
                println("Ascending order: $num3,$num1,$num2")
                println("Descending order: $num2,$num1,$num3")
            } else {
                println("Ascending order: $num1,$num3,$num2")
                println("Descending order: $num2,$num3,$num1")
            }
        } else if (num3 > num1 && num3 > num2) {
            if (num1 > num2) {
                println("Ascending order: $num2,$num1,$num3")
                println("Descending order: $num3,$num1,$num2")
            } else {
                println("Ascending order: $num1,$num2,$num3")
                println("Descending order: $num3,$num2,$num1")
            }
        }
        println("------------------------------------------------")

    }


