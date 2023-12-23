class IntegerSet {
    val limit: Int = 100
    var intBox = mutableListOf<Int>()
    var boolBox1 = Array(101) { false } //this structure initializes a Array of booleans where it has a fixed size(101) and every values is false

    init{

        for(num in 0..limit){
            println(this.boolBox1[num])
        }

    }

    fun isTrue(a: List<Int>) {
        for(num in 0..100){
            a.forEach{
                if(it == num){
                    this.boolBox1[num] = true
                }else{
                    this.boolBox1[num] = true
                }
            }
        }

    }
}


