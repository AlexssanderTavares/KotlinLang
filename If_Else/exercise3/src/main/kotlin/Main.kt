import java.util.Scanner;
/* HARD 12 - MAKE A PROGRAM FOR CALCULATE A PAYMENT PAPER, KNOWING THAT DISCOUNTS ARE
             WAGE TAX WITCH DEPENDS OF BRUTE SALARY(FOLLOWING THE TABLE BELOW) AND 3% FOR SyNDICATE
             AND FGTS CORRESPONDS TO 11% OF BRUTE SALARY, BUT ISN'T DISCOUNTED(IT'S THE COMPANY WHO DEPOSIT IT).

             THE LIQUID SALARY CORRESPONDS TO BRUTE SALARY MINUS THE DISCOUNTS. THE PROGRAM MUST ASK USER THE VALUE OF THE
             HOUR AND THE QUANTITY OF HOURS WORKED IN A MONTH.

             A - WAGE TAX DISCOUNT;
             B - BRUTE SALARY UNTIL R$ 900,00 - FREE;
             C - BRUTE SALARY UNTIL R$ 1500,00 - DISCOUNT OF 5%;
             D - BRUTE SALARY UNTIL R$ 2500,00 - DISCOUNT OF 10%;
             E - BRUTE SALARY ABOVE R$ 2500,00 - DISCOUNT OF 20%;

             PRINT ON THE SCREEN THE INFORMATIONS, FOLLOWING EXAMPLE BELOW, IN THE EXAMPLE: HOUR VALUE IS 5 AND QUIANTITY OF HOURS WORKED IS 220.

             BRUTE SALARY(5*220) : R$ 1100,00
             (-)WAGE TAX(5%) : R$ 55,00
             (-)INSS(10%) : R$ 110,00
             FGTS(11%) : R$ 121,00
             TOTAL DISCOUNTS : R$ 165,00
             LIQUID SALARY : R$ 935,00
 */
fun main() {
    val read = Scanner(System.`in`);
    print("Enter the price per hour worked: ");
    var hourPrice: Double = read.nextDouble();

    print("Enter total hours worked in a month: ");
    var hoursWorked: Int = read.nextInt();

    calcWage(hourPrice, hoursWorked);

}
fun calcWage(x: Double, y: Int){
    val bruteSalary: Double = x * y;
    if(bruteSalary <= 900.00){
        var wageTax: String = "Free";
        var syndicate: Double = bruteSalary * 0.03;
        var inss: Double = bruteSalary * 0.1;
        var fgts: Double = bruteSalary * 0.11;
        var totalDisc: Double = inss + syndicate;
        var liquidSalary: Double = bruteSalary - totalDisc;

        println("Brute Salary: R$$bruteSalary");
        println("(-)Wage Tax: R$$wageTax");
        println("(-)Syndicate: R$$syndicate")
        println("(-)INSS: R$$inss");
        println("FGTS: R$$fgts");
        println("Total Discounts: R$$totalDisc");
        println("Liquid Salary: R$$liquidSalary");

    }else if(bruteSalary <= 1500.00 && bruteSalary > 900.00){
        var wageTax: Double = bruteSalary * 0.05;
        var syndicate: Double = bruteSalary * 0.03;
        var inss: Double = bruteSalary * 0.1;
        var fgts: Double = bruteSalary * 0.11;
        var totalDisc: Double = inss + syndicate + wageTax;
        var liquidSalary: Double = bruteSalary - totalDisc;

        println("Brute Salary: R$$bruteSalary");
        println("(-)Wage Tax: R$$wageTax");
        println("(-)Syndicate: R$$syndicate")
        println("(-)INSS: R$$inss");
        println("FGTS: R$$fgts");
        println("Total Discounts: R$$totalDisc");
        println("Liquid Salary: R$$liquidSalary");

    }else if(bruteSalary <= 2500.00 && bruteSalary > 1500.00){
        var wageTax: Double = bruteSalary * 0.1;
        var syndicate: Double = bruteSalary * 0.03;
        var inss: Double = bruteSalary * 0.1;
        var fgts: Double = bruteSalary * 0.11;
        var totalDisc: Double = inss + syndicate + wageTax;
        var liquidSalary: Double = bruteSalary - totalDisc;

        println("Brute Salary: R$$bruteSalary");
        println("(-)Wage Tax: R$$wageTax");
        println("(-)Syndicate: R$$syndicate")
        println("(-)INSS: R$$inss");
        println("FGTS: R$$fgts");
        println("Total Discounts: R$$totalDisc");
        println("Liquid Salary: R$$liquidSalary");

    }else if(bruteSalary > 2500.00){
        var wageTax: Double = bruteSalary * 0.2;
        var syndicate: Double = bruteSalary * 0.03;
        var inss: Double = bruteSalary * 0.1;
        var fgts: Double = bruteSalary * 0.11;
        var totalDisc: Double = inss + syndicate + wageTax;
        var liquidSalary: Double = bruteSalary - totalDisc;

        println("Brute Salary: R$$bruteSalary");
        println("(-)Wage Tax: R$$wageTax");
        println("(-)Syndicate: R$$syndicate")
        println("(-)INSS: R$$inss");
        println("FGTS: R$$fgts");
        println("Total Discounts: R$$totalDisc");
        println("Liquid Salary: R$$liquidSalary");

    }

}