class Musician(var name:String) {

    lateinit var playlable: Playlable

    fun startPlay(){
        playlable.play()
    }
}

interface Playlable{
    fun play()

}

class Guitar: Playlable{
    override fun play(){
        println("Playing guitar")
    }
}

class Battery: Playlable{
    override fun play(){
        println("Playing battery")
    }
}

class Violin: Playlable{
    override fun play() {
        println("Playing violin")
    }
}