class Client(var name:String){

    lateinit var menu : Menu

    fun askMenu() : String{
        return menu.dailyCombo()
    }
}

interface Menu {
    fun dailyCombo():String
}

class McDonald: Menu{
    override fun dailyCombo(): String {
        return "Big Mac"
    }
}

class BurgerKing: Menu{
    override fun dailyCombo(): String {
        return "Triple Whooper"
    }
}

class RockaBilly: Menu{
    override fun dailyCombo(): String {
        return "Rocka Burger"
    }
}