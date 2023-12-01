class Register constructor(var email: String = "", var username: String = "", var pass: String = "", var isAdmin: Boolean = false) {
    val userEmail = email
    val userPass = pass
    val userName = username
    val admin = isAdmin

    constructor(email: String, pass: String) : this(email, "",pass, false) //this must pass a default value to fill the first constructor params
    /*
        Overloading constructor, allowing to instance this class without passing isAdmin value as argument
        EXAMPLE: newUser = Register("user@user.com", "SomeUser" , "123456") by  default, isAdmin is set as false
        This reference to the Class (SELF)

     */
}

/*
    This constructor is the same as Class Movie.
    With default value and explicit constructor keyword
 */