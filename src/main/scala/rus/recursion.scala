package rus

import scala.annotation.tailrec

object recursion extends App {
  //  has limitation
  def factorial(n: Int): Int = {
    if (n > 1) factorial(n - 1) * n
    else 1
  }

  //  println(factorial(5))

  /* (5 * (4 * (3 * (2 * (1)))))*/


  //  no limitation
  def factorial2(n: Int): BigInt = {
    @tailrec
    def f(n: Int, acc: BigInt = 1): BigInt =
      if (n > 0) f(n - 1, acc * n)
      else acc

    f(n)
  }

  println(factorial2(5000))


}
