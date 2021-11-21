package scalaFun.Examples
import scala.io.StdIn

object checkNumberPositiveOrNot extends App {
  println("Iltimos ixtiyoriy son kiriting: ")
  val son: Int = StdIn.readInt()
  val natija = if (son == 0)
    "Kiritilgan son nolga teng!"
  else if (son > 0)
    "Musbat"
  else
    "Manfiy"

  println(natija)
}
