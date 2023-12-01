import java.util.*;
fun main(){
    val read = Scanner(System.`in`)

    print("Enter a character: ");
    val userChar = read.nextLine();
    val data = userChar.lowercase();

    if(data == "a" || data == "e" || data == "i" || data == "o" || data == "u"){
        println("Vowel!");
    }else{
        println("Not a vaowel!")
    }
}