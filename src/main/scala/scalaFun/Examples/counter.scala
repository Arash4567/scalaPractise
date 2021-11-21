package scalaFun.Examples

import scala.io.StdIn

object counter extends App {

  println("Iltimos istalgan butun son kiriting:")
  var number: Int = StdIn.readInt()
  var cnt: Int = 0
  while (Math.abs(number) > 1) {
    number = number / 2;
    cnt += 1
  }
  println(s"Kiritilgan sonni 2 ga $cnt marta bo'lish mumkin.")
}
