class People() {
    var name: String = ""
    var age: Int = 0
    var job: String = ""

    constructor(name: String, age: String, job: String) : this()

    fun leapYear(): Int{
        val leap: Int = age / 4
        return leap
    }
}