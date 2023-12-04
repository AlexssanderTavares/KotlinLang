internal class Stringing(val numberOfStrings: Int, val label: String){

}

//module
//Instrument can be an abstract class because it is just a concept of how other classes must have in their definitions
abstract class Instrument(var name: String, var color: String) {

    private lateinit var stringing: Stringing
    fun console(){
        println("This instrument is ${this.color} and has ${stringing.numberOfStrings} strings")
    }

    abstract fun tune():Boolean

    fun addStringing(num:Int,label:String){
        stringing = Stringing(num, label)
    }

    fun play(){
        if(tune()){
            println("Playing...")
        }else{
            println("Tune before playing")
            tune()
        }
    }
}

abstract class StringInstrument(name: String, color:String, var strings: Int):Instrument(name,color){

}

class Guitar(name:String, color: String) : StringInstrument(name,color,6){
    init{
        addStringing(6,"Yamaha")
    }
    override fun tune():Boolean{
        println("Tuned in E(MI)")
        return true
    }
}

class Cello(name:String, color:String):StringInstrument(name,color, 4){
    init{
        addStringing(4,"brown")
    }
    override fun tune():Boolean{
        println("Tuned in C(DÓ)")
        return true
    }

}