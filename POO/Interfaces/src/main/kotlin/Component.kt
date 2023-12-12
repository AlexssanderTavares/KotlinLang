abstract class Component {
    abstract fun position() : Pair<Int,Int>

    open fun render(){
        println("Rendering ${position().first} | ${position().second}")
    }
}


abstract class Text(val text: String) : Component(){
    override fun render(){
        super.render()
        println("Rendering text: ${text}")
    }
}

class Btn(text: String, val bgColor: Int, val pos: Pair<Int,Int>) : Text(text){
    override fun position(): Pair<Int,Int>{
        return pos
    }
    override fun render(){
        super.render()
        println("Rendering button color: ${bgColor}")
    }
}

class Link(text: String, val pos: Pair<Int,Int>) : Text(text){
    override fun position(): Pair<Int,Int>{
        return pos
    }
}