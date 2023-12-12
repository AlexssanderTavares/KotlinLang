import java.io.FileWriter
import java.io.IOException


class User(val logger: LoggerGenerico) {

    init{
        log("User created")
    }

    fun post(){
        log("New post created")
    }

    fun log(post:String){
        logger.print("Hello World")
    }
}

interface LoggerGenerico{ // interfaces carries every other classes that heir this interface, is a double way inheritance
    fun print(message: String)
}

class SystemConsole: LoggerGenerico{
    override fun print(message: String){
        println(message)
    }
}

class ArchiveSystem: LoggerGenerico{
    override fun print(message: String) {
        val path = "D:\\documentos\\anotações\\aula.txt"
        try{
            val fw = FileWriter(path, true)
            fw.write(message)
            fw.write("\n")
            fw.close()
        }catch(e: IOException){
            e.printStackTrace()
        }
    }
}