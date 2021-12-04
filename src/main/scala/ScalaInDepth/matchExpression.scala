package ScalaInDepth

object matchExpression {
  def main(args: Array[String]):Unit = {
    def matchNumber(x:Int):String = x match {
      case 1 => "One"
      case 2 => "Two"
      case _ => "Don't match your number!"
    }
    println(matchNumber(2))
    println(matchNumber(3))
    case class Car(name: String, price: Int)
    val nexia = new Car("Nexia", 2500)
    val damas = new Car("Damas", 4500)
    val malibu = new Car("Malibu", 15500)
    val cars = List(nexia, damas, malibu)
    for (car <- cars){
      car match {
        case Car("Nexia", 2500) => println("Nexia")
        case Car("Damas", 4500) => println("Damas")
        case Car(name, cost) => println(name + " is " + cost)
      }
    }
  }
}
