package someting

import scala.io.StdIn.readLine

object solve1 {
  def main(args: Array[String]) {
    var str = readLine()
    val num =
      try {
        str.toInt
      } catch {
        case ex: NumberFormatException => 0
      }
    if (num != 0) {
      if (num % 7 == 0) {
        println("True")
      } else println("False")
    } else {
      println("Please enter the number and try again!")
    }
  }

}
