import java.util.*
class Professor(name: String, var discipline: String) : People(name) {
    val read: Scanner = Scanner(System.`in`)
    init{
        canGiveLesson = true
    }

    fun giveNote1(): Int {
        print("Give note 1: ")
        var note1: Int = read.nextInt()
        return note1
    }

    fun giveNote2(): Int {
        print("Give note 2: ")
        var note2: Int = read.nextInt()
        return note2
    }

    fun giveNote3(): Int {
        print("Give note 3: ")
        var note3: Int = read.nextInt()
        return note3
    }

    fun giveNote4(): Int {
        print("Give note 4: ")
        var note4: Int = read.nextInt()
        return note4
    }
}