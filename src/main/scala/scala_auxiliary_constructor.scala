/*Auxiliary constructor*/
//             getter?  setter?
// var       | yes    | yes
// val       | yes    | no
// default   | no     | no

class Shaxs(var name: String, var age: Int) {
  def this(){
    this("Tom", 15)
  }
  def this(name: String) {
    this(name, 26)
  }
} //Auxiliary constructor
object scala_auxiliary_constructor {
  def main(args: Array[String]): Unit = {
    val user1 = new Shaxs("Jack", 16)
    val user2 = new Shaxs()
    val user3 = new Shaxs("Jack")
    println(user2.name)
    println(user3.age)
    println(user1.name)
  }
}
