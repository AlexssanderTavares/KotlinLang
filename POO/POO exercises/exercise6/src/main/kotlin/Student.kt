class Student(name: String, var inscription: Int) : People(name) {
    var n1: Int = 0
    var n2: Int = 0
    var n3: Int = 0
    var n4: Int = 0

    fun media(arg1: Int, arg2: Int, arg3: Int, arg4: Int) : Int{
        val media: Int = (arg1 + arg2 + arg3 + arg4) / 4
        this.n1 = arg1
        this.n2 = arg2
        this.n3 = arg3
        this.n4 = arg4
        return media
    }

    fun setNote1(note:Int): Int{
        this.n1 = note
        return this.n1
    }

    fun setNote2(note:Int): Int{
        this.n2 = note
        return this.n2
    }

    fun setNote3(note:Int): Int{
        this.n3 = note
        return this.n3
    }

    fun setNote4(note:Int): Int{
        this.n4 = note
        return this.n4
    }
}