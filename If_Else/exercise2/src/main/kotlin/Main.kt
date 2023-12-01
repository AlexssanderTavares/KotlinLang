/* HARD 11 - THE CSM ORGANIZATIONS RESOLVED TO GIVE AN AUGMENT ON THEIR COLABORATOR'S WAGES AND
             CONTRACT YOU TO DEVELOP A PROGRAM THAT CALCULATES THOSE READJUSTMENTS.

             a - MAKE A PROGRAM THAT RECEIVE THE WAGE OF A COLABORATOR SEEKING THE NEXT CRITERIA,
             BASED IN THEIR ACTUAL WAGES;
             b - WAGES UNTIL R$ 280,00(INCLUDING): GROW OF 20%;
             c - WAGES BETWEEN R$ 280,00 AND R$ 700,00: GROW OF 15%;
             d - WAGES BETWEEN R$ 700,00 AND R$ 1500,00: GROW OF 10%;
             e - WAGES OF R$ 1500,00 OR MORE: GROW OF 5%;

             AFTER CALCULATES; SHOW ON THE SCREEN;

             a - WAGE BEFORE READJUSTMENT;
             b - THE VALUE OF GROW PERCENT APPLIED;
             c - THE VALUE OF AUGMENT;
             d - THE NEW SALARY, AFTER INCREASED;
* */

fun main() {
    print("Enter worker's wage value: ");
    var wage: Double = readln().toDouble();

    if(wage <= 280.00 && wage > 0){
        var percent: Double = 0.20;
        var adjust: Double = wage * percent;
        var newAdjust: Double = adjust + wage
        if(newAdjust > 280.00) {
            println("|Wage before adjust: R$wage |Grow percentage: %${(percent * 100).toInt()}% |Grow value: R$$adjust |Wage adjusted: R$$newAdjust");
        }else if(newAdjust <= 280.00){
            println("|Wage before adjust: R$wage |Grow percentage: %${(percent * 100).toInt()}% |Grow value: R$${adjust+adjust} |Wage adjusted: R$${newAdjust+adjust}");
        }

    }else if(wage > 280.00 && wage <= 700.00){
        var percent: Double = 0.15;
        var adjust: Double = wage * percent;
        var newAdjust: Double = adjust + wage
        println("|Wage before adjust: R$$wage |Grow percentage: ${(percent * 100).toInt()}% |Grow value: R$$adjust |Wage adjusted: R$$newAdjust");
    }else if(wage > 700.00 && wage <= 1500.00){
        var percent: Double = 0.10;
        var adjust: Double = wage * percent;
        var newAdjust: Double = adjust + wage
        println("|Wage before adjust: R$$wage |Grow percentage: ${(percent * 100).toInt()}% |Grow value: R$$adjust |Wage adjusted: R$$newAdjust");
    }else if(wage > 1500.00){
        var percent: Double = 0.05;
        var adjust: Double = wage * percent;
        var newAdjust: Double = adjust + wage
        println("|Wage before adjust: R$$wage |Grow percentage: ${(percent * 100).toInt()}% |Grow value: R$$adjust |Wage adjusted: R$$newAdjust");
    }

}