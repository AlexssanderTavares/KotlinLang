fun main() { //fun main is always the entry point, the starting point of any program
    //prints
    println("Hello Kotlin!"); //println break the line at end of strings
    print("Hello Kotlin!"); //print don't break the line at end of strings
    print("Hello Kotlin!");

    // //is for inline comments
    /**/ //is for comment block


    val num1: Int = 5; //val is for constants declaration, it's value will not change along the program
    var num2: Int = 2; //var is for non-constants declaration, it's value can be modified along the program

    //types

    //numbers
    var data1: Byte = 127; //byte for value <= 127 (8 bits)
    var data2: Short = 32767; //short for value <= 32767 (16 bits)
    var data3: Int = 2147483647; //int for value <= 2147483647 (32 bits)
    var data4: Long = 9223372036854775807; //long for value <= 9223372036854775807 (64 bits)

    //unsigned integers
    var data5: UByte; //8bit integer 0..255
    var data6: UShort; //16bit integer 0..65535
    var data7: UInt; //32bit integer 0..2^32-1
    var data8: ULong; //64bit integer 0..2^64-1

    //floating points
    var numb1: Double = 19.90 //fix size to 64-bits
    var numb2: Float = 19.90f //fix size to 32-bits
    var numb3 = 19.90 //as default, Kotlin fixes inferred floating point types as 64-bits, this is the same as numb1 and numb2 without its accuracy in memory management

    //booleans
    var data9: Boolean = true; //true or false
    var data10: Boolean = false; //true or false
    var data11: Boolean? = null; //true, false or null

    /*
        || > Or
        && > and
        ! > not

     */

    //character
    var data12: Char = 'a';
    var data13: Char = '\uFF00';

    /* ESCAPES
        \t - tab
        \b - backspace
        \n - new line
        \r - Carriage Return - Moves cursor to the beginning of the line without advancing to the next line
        \' - adds single quotation on the sentence string like - 'hello there'
        \" - adds double quotation on the sentence string like - "hello there"
        \\ backslash - adds \ to the sentence string like - \hello there
        \$ dollar sign - adds dollar on the sentence string like - $hello there
     */

    //Strings
    var data14: String = "abcd 1234";
    //multiline Strings
    var data15: String = """
        ||TEXT LINE 1
        ||TEXT LINE 2
        ||TEXT LINE3
    """.trimMargin("*");

    var data16: Int = 1;
    println("I = $data16");
    println("I =  ${data15.length}");

    //Arrays
    var data17: Array<Int> = arrayOf(1,2,3);
    var data18: Array<String> = arrayOf("Alex","Lindiane","Antonio","Andrea");
    var data19: Array<Double>; //declaration of a array without any value. Can be filled later with variables
    var data20: IntArray = intArrayOf(1,2,3); //sintax exclusive for primitive type arrays declarations
    var arr = IntArray(5); //defines an array of integers with size 5
    var arrStrings = arrayOf<String>(); //defines an empty array without size definition that can bem filled with user Strings inputs

    //prints

    println(num1::class);
    println(data1::class);
    println(data2::class);
    println(data3::class);
    println(data4::class);
    //println(data5::class);
    //println(data6::class);
    //println(data7::class);
    //println(data8::class);
    println(data9::class);
    println(data10::class);
    //println(data11::class);
    println(data12::class);
    println(data14::class);
    println(data17::class);
    println(data18::class);
    //println(data19::class);


    // char - encryption
    val name: String = "Alex"
    val firstChar = "A" // each char has 16-bit memory size
    val firstEscape = '\n' //chars can store escapes

    //castings

    /*int*/ val convert1 = data3.toDouble(); //the value stored in data3 is changed to double format and this convertion result is saved in the new variable convert1
    println(convert1);
    val convert2 = convert1.toString();
    val convert3 = numb1.toInt();
    println(convert3)

    // text formatation

    val name2: String = "alexssander tavares"
    val format = name.uppercase()
    val format2 = name.lowercase()
    val size = name.length
    val message = """
        Hello,
        World!
    """.trimIndent()

    // Conditions (Control flow)

    val product = "iPhone"

    if(product.length <= 3){
        println("Product can't be registered, name size error!")
    }else{
        print("Success!!")
    }

    val preco = 20_001
    if(preco > 30_000){
        println("30% off earned")
    }else if(preco > 20_000){
        println("20% off earned")
    }else if(preco > 10_000){
        println("10% off earned")
    }else{
        println("You don't earn any discount")
    }

    //  Nullables
    var text: String? = "smartphone"
    text = null;
    // when type declaration is followed by "?" it means that variable allows null value.
    val textSize = text?.length // "?" will verify if is there any true value stored in variable or if is a null value,
                                // null value is returned when variables that allows null is not asigned with any value
                                // of the declared type
    val textSize2 = text?.length ?: 0 // ?: expression, is the same  of textSize, but return the value declared at end
                                        // of expression: 0 in case


    println(hello1(name2));
    hello2(name2);
    hello3();
    hello4(40);
    hello4(age = 40); //you can name each argument in a function for better understanding
    validate();
    validate("Alexssander",27, true);
}
//  Functions

fun hello1(name: String): String{
    val user: String = name
    return "Hello $user"
}
fun hello2(name: String): Unit{ //every functions in kotlin must have a declared return type(String,Int etc) but just if
                                //it should return any value, in cases where it hasn't a return, you must call Unit type
    println("Hello $name");
}

fun hello3() = println("Hello World!"); //inline body, used when a function has just one line on its body.
fun hello4(age: Int) {
    if(age>18){
        println("You can enter!");
    }else
        println("You can't enter!");
}

// Function Overloads

fun hello4(name: String){ //the name is the same as hello4 function defined before, but the difference here is the
                            //parameter type. Kotlin always care about data types, the name of variables, functions,
                            // classes etc just matter for programmer.
    println("Hello $name");

}

fun validate(name: String?  = null, age: Int? = null, isAdmin: Boolean = false){
    if (name == null && age == null){
        println("I have no data to work!");
    }else
        println("Name: $name | Age: $age | Admin: $isAdmin");
}