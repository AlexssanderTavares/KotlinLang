fun main() {
    /* INTERMEDIATE 6 - MAKE A PROGRAM THAT READS THREE NUMBERS THEN VERIFY USING IF AND ELSE AND SHOW THE GREATER BETWEEN THEM
       INTERMEDIATE 7 - MAKE A PROGRAM THAT READS THREE NUMBER THEN VERIFY USING IF AND ELSE AND SHOW THE GREATER AND LOWER BETWEEN THEM
    * */
    print("Enter a number: ");
    var num1: Int = readln().toInt();

    print("Enter another number: ");
    var num2: Int = readln().toInt();

    print("Enter another number: ");
    var num3: Int = readln().toInt();



    if(num1 > num2 && num1 > num3){
        if(num2 > num3){
            println("$num1 is greater!")
            println("$num3 is lower!");
        }else{
            println("$num1 is greater!")
            println("$num2 is lower!");
        }
    }else if(num2 > num1 && num2 > num3){
        if(num1 > num3){
            println("$num2 is greater!")
            println("$num3 is lower");

        }else {
            println("$num2 is greater!")
            println("$num1 is lower");
        }
    }else {
        if (num2 > num1) {
            println("$num3 is greater!")
            println("$num1 is lower");
        } else {
            println("$num3 is greater!")
            println("$num2 is lower");
        }
    }
}