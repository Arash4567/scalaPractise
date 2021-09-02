/*1 Quyidagi shartlar bajarilganda “rost”, aks holda “yolg‘on” qiymat qabul qiluvchi mantiqiy
munosabat C++ tilida yozilsin: k butun soni 7 ga bo`linadi.
 */
import scala.io.StdIn._

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
