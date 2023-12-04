//Abstract classes is open as default configuration,
//Abstract ideas is the opposite of Concrete ideas about something, while Concrete is something truly defined, abstract is something without
//this definition, is just an idea of how something could be. In the example below, Class People is just a not truly defined idea, a concept of how a people must be in a context
//and Class Student and Professor is the Concrete classes that follows the People concept. Only inherited classes is used, abstract is just a
//way to not define classes with the same basic concept. Professor and Student is both People then they have the same concept before anything else.

abstract class People(var name: String, var address: String) {
    protected var libAccess: Boolean = false

    fun describe() = "My name is ${this.name} and my address is ${this.address}. Access permission: ${this.libAccess}"
}

class Student(name:String, address: String):People(name,address){
    init{
        libAccess = false
    }
}

class Professor(name:String, address: String):People(name,address){
    init{
        libAccess = true
    }
}