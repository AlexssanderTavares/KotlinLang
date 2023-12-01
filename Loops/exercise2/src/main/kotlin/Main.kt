/* INTERMEDIATE 7 - A SHOP HAS A DISCOUNT POLICY ACCORDING WITH CUSTOMERS PURCHASING VALUES.
                    DISCOUNTS BEGINS ABOVE R$ 500,00. FOR EVERY R$ 100,00 ABOVE, CUSTOMERS EARN 1% DISCOUNT WITCH ACCUMULATES
                    UNTIL 25%.

                    MAKE A PROGRAM THAT SHOWS THE TABLE OF DISCOUNTS LIKE BELOW:
                    PURCHASE VALUE - DISCOUNT - FINAL VALUE
 */

import java.util.*;
fun main(){
    //val rand = Random(5);
    val read = Scanner(System.`in`);

    print("Enter customer's name: ");
    var custName = read.nextLine();



    print("Enter $custName purchase total: ");
    val purchaseValue = read.nextDouble();

    if(purchaseValue >= 500.00){
        println("PURCHASE VALUE - DISCOUNT - FINAL VALUE")
        for(discount: Int in 0..25){
            var withDisc: Double = purchaseValue * (discount/100);
            var total: Double = purchaseValue + withDisc;
            purchaseValue += 100;
        }
    }





}