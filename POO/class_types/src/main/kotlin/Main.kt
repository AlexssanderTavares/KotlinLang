fun main(){
    //Type 1: Nested Class (Classes aninhadas)
    //Type 2: Inner Classes (Classes internas)
    //Type 3: Enum Classes (Classes enumeradas)

    //Nested CLass
    val royKhan = Musician()
    royKhan.desc()
    val bigMikes = Musician.Microphone() //the object receives a call of the two classes in hierarchy order
    bigMikes.desc()

    //Inner Class
    val tobias = SecondMusician()
    val show = tobias.Guitar() //tobias becomes the Father CLass and Guitar is his son
    show.desc()

    //Enum Class
    println(CreditCard.MASTER)
    println(CreditCard.MASTER.ordinal)

    // -------------------------------------------------------------------

    val user = User("Alexssander" , false)
    val creditCardAPIName = "master"

    val card = CreditCard.valueOf(creditCardAPIName.uppercase())


    when(user.name){
        "Tiago" -> {
            println("Tiago encontrado no banco de dados")
        }
        "Marcelo" -> {
            println("Marcelo encontrado no banco de dados")
        }
        else -> println("Nenhum usuário encontrado")

    }

    when{
        user.name == "Tiago" -> println("Tiago encontrado no banco de dados")
        else -> println("Nenhum usuário encontrado")
    }

    when(card){
        CreditCard.VISA -> println("Ganhou desconto!")
        else -> println("Nenhum desconto aplicado!")
    }

    val discount = if(card == CreditCard.VISA){
        "Desconto de 10%"
    }else if(card == CreditCard.MASTER){
        "Desconto de 20%"
    }else{
        "Nenhum desconto aplicado"
    }

    println(discount)

    //---------------------------------------------------------------------------

    val user1 = User("Alexssander", false)
    val user2 = User("Tiago" , false)

    println(user1 == user2) //se a classe é normal: cada variavel retorna o endereço de memoria, os endereços não são iguais
                            // data class: vai comparar cada propriedade da classe, verificando os valores passados no momento em que a classe é instanciada no objeto

    val (name, isAdmin) = user1 //desestrutura a classe em variaveis independentes, disponível apenas a Data Classes, isto não deleta a classe em si
    //desestrutura na mesma ordem em que os parametros sao declarados na definição da classe

    println(user2.component2()) //component é uma das funções ocultas que o Kotlin cria assim que uma classe é definida, cada nova propriedade criada gera um novo component




}
