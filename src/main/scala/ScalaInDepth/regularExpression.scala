package ScalaInDepth
import scala.util.matching.Regex

object regularExpression extends App {
  //  Regular Expression
  val pattern1 = new Regex("Hello")
  val pattern2 = "abcdefghijklmnopqrstuvwxyz".r
  val pattern3 = "[Hh]ello".r

  val text = "Hello Scala world! Hello Scala world!"
  val text2 = "Hello Scala world! hello Scala world!"
  println(pattern1 findFirstIn text)
  println((pattern1 findAllIn text).toList)
  println((pattern1 findAllMatchIn text).toList)
  println((pattern1 findFirstMatchIn text).toList)
  println((pattern3 findAllIn text2).toList)
  val numbers = "My name is Tom. I am 45 years old. I have 3 brother!"
  val numberPattern = "[0-9]+".r
  println((numberPattern findAllIn numbers).toList)

}
