fun main(){
    val btn = Btn("Save",0xFF0000, Pair(20,30))
    btn.render()

    val link = Link("Enter", Pair(40,50))
    link.render()

    //---------------------------------------------------------
    fun searchInstrument(): Playlable{
        return Guitar()

    }
    val musician1 = Musician("Alexssander")

    musician1.playlable = searchInstrument()

    val client1 = Client("Alexssander")
    client1.menu = BurgerKing()
    println(client1.askMenu())

    //-------------------------------------------------------
    fun searchConsoleSystem():LoggerGenerico{
        return ArchiveSystem()
    }
    val userA = User(searchConsoleSystem())

    userA.post()
}
