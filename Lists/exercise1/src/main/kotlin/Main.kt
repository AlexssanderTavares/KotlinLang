import java.util.*

fun main(){
    /*
    1. Create a program that implement the following functions:
    a - totalPairs: it receives an array of integers as parameter and return an integer number indicating the total of existing pairs in the array
    b - highestValue: it receives two arrays of integers as parameter and return the highest existing number in the array
    c - totalEquals: it receives two arrays of integers as parameter and return the total of existing equal numbers in both arrays

    2. Create a program that implements a function "betweenValues". This function receives an integer array as parameter and returns another
        integer array containing every value in the first array where they are between the minimum and maximum values(which are also values passed
        as parameters on the function)
        After, create variables where the user can input minimum and maximum values and then call the function passing array, minimum and
        maximum as arguments.
    */

    // Resolution 1
    println("Resolution 1")
    val arr1: IntArray = intArrayOf(0,1,2,3,4,5,6,7,8,9)
    val arr2: IntArray = intArrayOf(10,11,12,13,14,15,16,17,18,19,20)
    val arr3: IntArray = intArrayOf(10,156,12,43,1111,1,16,139,18,19,20)
    val arr4: IntArray = intArrayOf(10,11,12,13,14,15,16,17,18,19,20)

    println(totalPairs(arr1) + "\n")

    println(highestValue(arr2) + "\n")

    println(totalEqual(arr3,arr4) + "\n")
    println("-----------------------------------------------------------")
    //-----------------------------------
    // Resolution 2
    println("Resolution 2")
    arr3.forEach {
        println(it)
    }

    val read = Scanner(System.`in`)
    print("Enter a minimum value: \n")
    val num1: Int = read.nextInt()
    print("Enter a minimum value: \n")
    val num2: Int = read.nextInt()


    betweenValues(arr3,num1,num2).forEach {
        if(it != 0){
            println("The values between $num1 and $num2 is: $it")
        }
    }
    println("-----------------------------------------------------------")

    // Resolution 3
    val list1 = listOf(1,2,3,4,5)
    val list2 = listOf(6,7,8,9,10)
    println(unite(list1,list2))
}

fun totalPairs(arr: IntArray) : String{
    var n: Int = 0
    for(num in arr){
        if(num % 2 == 0) {
            n++
        }
    }
    return "Total of Pairs: $n"
}

fun highestValue(arr: IntArray) : String{
    var high = 0
    var n = 0
    do{
        for(num in arr){ //num is always equals to arr[0] = 10
            if(arr[n] > num){
                 high = arr[n]
            }
        }
        n++
    }while(n  < arr.size)
    return "The Highest is: $high"
}

fun totalEqual(arr1: IntArray, arr2: IntArray) : String{
    var n = 0
    var count = 0
    for(num1 in arr1){
        for(num2 in arr2){
            if(num1 == num2){
                count++
            }
        }
    }
    return "The total of equals is: $count"
}

fun betweenValues(arr: IntArray, min:Int, max: Int) : MutableList<Int> {
    var n: Int = 0
    val newArr = MutableList(arr.size, {0})
    for (num in arr) {
        if (num in min..max) {
            newArr.add(num)
        }
    }
    return newArr
}

fun unite(v1: List<Int>, v2: List<Int>) : List<Int>{
    val unite = listOf(v1,v2)
    return unite.flatten()

}








