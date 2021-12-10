package scalaFun.Examples

object scala_methods extends App {
  def largest(num: Int*): Unit = num.foreach(i => println(i + 1))

  largest(2, 34, 454)
  largest(23)
  largest(123, 2131)
}
