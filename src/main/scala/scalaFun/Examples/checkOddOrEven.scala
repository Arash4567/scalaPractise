package scalaFun.Examples
import scala.io.StdIn

object checkOddOrEven extends App {
  println("Iltimos ixtiyoriy bitta son kiriting: ")
  val son: Int = StdIn.readInt()
  val natija = if (son % 2 != 0) "Toq son!" else "Juft son!"
  println(natija)
}
