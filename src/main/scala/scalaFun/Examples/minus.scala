package scalaFun.Examples

import scala.io.StdIn

object minus extends App {
  println("Ixtiyoriy manfiy son kiriting: ")
  var number: Int = StdIn.readInt()
  while (number != 0) {
    number -= 1
    println(number)
  }
  //  Very very bad code (Infinite loop)

}
