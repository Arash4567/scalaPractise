package scalaFun.Examples

object Summa extends App {
  def summa(n: Int): Int = if (n != 0) n + summa(n - 1) else 0
  println(summa(10))
}
