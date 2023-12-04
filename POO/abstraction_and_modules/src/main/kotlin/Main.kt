fun main(){
    //Module/Internal class
    val g = Guitar("Gibson", "red")
    val c = Cello("Montreal","brown")
    g.console()

    //Abstract
    //val people = People("Fulano", "Street A") // this will never work because is not used, is just the concept of the inherited classes
    val prof = Professor("Girafalles", "Street 8")
    val std = Student("Little Carlos", "August Street")


    g.play()
    c.play()

}