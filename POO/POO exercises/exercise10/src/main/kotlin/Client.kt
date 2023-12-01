class Client(var name: String, var doc: String, var age: Int) {

    fun describe():String{
        return "|Name: ${this.name} | DOC: ${this.doc} | Age: ${this.age}|"
    }
}