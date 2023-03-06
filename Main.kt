fun main(args: Array<String>) {
   var hello = "hello"
    hello = "hello"
    print(hello)
    var toto: String ="toto"
    println(toto)
    var message:String? ="im learningg kotlin"
    message = null
    println(message.toString())
 fun main() {

  val user1 = User("ihab@example.com", 11, 30)
  val user2 = User("ihab@example.com", 22, 25)


  val users = ArrayList<User>()
  users.add(user1)
  users.add(user2)


  for (user in users) {
   println("Email: ${user.email}, Password: ${user.password}, Age: ${user.age}")

  }}

  }