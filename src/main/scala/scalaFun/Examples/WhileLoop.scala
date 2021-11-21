package scalaFun.Examples

import scala.io.StdIn
object WhileLoop extends App {

  println("Iltimos istalgan butun son kiriting:")
  var number: Int = StdIn.readInt()
  while (number >= 1) {
    println("Hello World!")
    number -= 1
  }
}