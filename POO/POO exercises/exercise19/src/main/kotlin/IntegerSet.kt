class IntegerSet {
    private val limit: Int = 100
    var intBox = mutableListOf<Int>()
    var boolBox1 =
        Array(101) { false } //this structure initializes an Array of booleans where it has a fixed size(101) and every values is false

    init {
        println("Init context")
        for (num in 0..limit) {
            println(this.boolBox1[num])
        }
        println("---------------------------")
        var union = Pair(0,false)
    }

    fun describe() {
        this.intBox.forEach {
            println(it)
        }
    }

    fun isTrue(a: List<Int>) {
        for (num in 0..100) {
            a.forEach {
                if (it == num) {
                    this.boolBox1[num] = true
                } else {
                    this.boolBox1[num] = true
                }
            }
        }
    }

    fun unite() {
        for (num in 0..100) {
            this.boolBox1.forEach {
                if (it == true) {
                    this.intBox.forEach {
                        if (it == num) {
                            var union = Pair(this.intBox[num], this.boolBox1[num])
                            println(union)
                        }
                    }
                } else {
                    var union = Pair(0,this.boolBox1[num])
                    println(union)
                }
            }
        }
    }
}


