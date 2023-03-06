class User {
     var email :String = ""
     var password :Int = 0
     var age :Int = 0

    constructor(email: String, password: Int, age: Int) {
        this.email = email
        this.password = password
        this.age = age
    }
    fun sayMyName() {
        val name = null
        println(name)
    }
    fun isStudent(islear : Boolean): Boolean {
        return islear
    }

}