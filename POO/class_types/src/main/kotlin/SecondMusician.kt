class SecondMusician {
    var style: String = "Metal"
    fun desc() = println("My Style is: $style")
    inner class Guitar{
        var strings = 6
        fun desc() = println("Playing a guitar with $strings strings in $style style")
    }
}