/* INTERMEDIATE 7 - A SHOP HAS A DISCOUNT POLICY ACCORDING WITH CUSTOMER'S PURCHASE VALUE.
*                   THE DISCOUNTS BEGINS ABOVE R$ 500,00. FOR EACH R$ 100 ABOVE OF R$ 500,00 THE CUSTOMER EARN 1%
*                   OFF UNTIL 25%
*                   EXAMPLE:
*                       R$ 500,00 = 1% || R$ 600,00 = 2%...ETC...
*
*                   MAKE A PROGRAM THAT SHOWS THE TABLE OF DISCOUNTS FOLLOWING THE PATTERN BELOW
*                   PURCHASE VALUE - DISCOUNT PERCENT - FINAL VALUE
* */


import java.util.*;
fun main() {
    val read = Scanner(System.`in`);
    print("Enter purchase value: ");
    var purchaseValue: Double =  read.nextDouble();

    if(purchaseValue > 500.00){
        println("| Purcase Value | Discount Percent | Final Value |");
        var discount: Int = 0;
        for(discount in 0..25){
            var discountValue: Double = purchaseValue * (discount/100);
            var total: Double = purchaseValue - discountValue;
            println("| $purchaseValue | $discount | $total |");
            purchaseValue += 100;

        }
    }else{
        println("Value below R$ 500,00 is not able for discounts!");
        println("Your purchase value is: $purchaseValue");
    }
}