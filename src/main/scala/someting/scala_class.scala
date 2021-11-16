package someting

/*Class*/
// var       | getter | setter
// val       | getter | ------
// default   | ------ | ------

class Person(var name: String, var age: Int) //Mutable class
class User(val name: String, val age: Int) //Immutable class
class Inson(private var name: String, val age: Int){
  def getName(): Unit ={
    println(name)
  }
} //Immutable class
object scala_class {
  def main(args: Array[String]): Unit = {
    val user1 = new Person("Jack", 16)
    println(user1.name)
    println(user1.age)
    user1.name = "Mark"
    user1.age = 18
    println(user1.name)
    println(user1.age)
    val user2 = new Inson("Tom", 45)
    user2.getName()
  }
}
