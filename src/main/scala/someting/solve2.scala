package someting

object solve2 {
  def main(args: Array[String]) {
    val result = readInt()
    result match {
      case 0 | 1 | 2 | 3 | 4 | 5 => println(result.toChar)
      case _ => println("z")
    }

  }
}
