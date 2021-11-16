package scalaFun

import scala.io.StdIn

/*object LessonOne {
  def main(args: Array[String]): Unit = {
    println("Hello Scala!")
  }
}*/
/*
object LessonOne extends App {
  println("Hello Scala!")
}*/
object LessonOneTwo extends App {
  //  Scala PrimitiveTypes
  /* |__________Type_________|_____Limit and Values_____|__________Info___________|
  *  | 1. Byte               | -127 to 128              | AnyVal                  |
  *  | 2. Short              | -32768 to 32767          | AnyVal                  |
  *  | 3. Int                | -2147483648 to 2147483647| AnyVal                  |
  *  | 4. Long               | -9223372036854775808 to +| AnyVal                  |
  *  | 5. Boolean            | true, false              | AnyVal                  |
  *  | 6. Char               | 'a', '+', '/', 'C', 'F'  | AnyVal                  |
  *  | 7. Float              | 32 bit                   | AnyVal                  |
  *  | 8. Double             | 64 bit                   | AnyVal                  |
  * */
  /*                 |-------------------------Any-------------------------|
          |-------AnyVal-------|                                |-------AnyRef-------|
    |-->Double           |-->Unit                      |-----Object             |--> String
    |     ^              |                       |-->Seq                        |--> Other Java Class
    |-->Float            |-->Boolean             |-->List
    |     ^              |                       |-->Option
    |-->Long             |                       |-->Other Scala Class
    |     ^              |                                \________________________________/
    |-->Int      <       |-->Char                                          |
    |     ^                                                              Null
    |-->Short
    |     ^
    |-->Byte
       \_____________________/                                 \_____________________/
                 |-------------------------Nothing-------------------------|
 * * * * * * * * * * * * * * * * * * * * * | ^, < --> VIEW |* * * * * * * * * * * * * * * * * * * * */
  /*
  * 1. Bizar yozgan Scala kodlar Scala compiler yordamida .class (.jar) [ya'ni Javabytecode] ga aylatiriladi va
  * JVM [Java Virtual Machine] da run bo`ladi
  * 2. Bizar yozgan Java kodlar Java compiler yordamida .class (.jar) [ya'ni Javabytecode] ga aylatiriladi va
  * JVM [Java Virtual Machine] da run bo`ladi*/

  /* * * * * * * * * * * * * * * * * * * * * | VAR and VAL | * * * * * * * * * * * * * * * * * * */
  //  var --> variable
  //  val --> const
  /*This syntax is true*/
  /*var x = 5
  x = x + 5*/
  /*This syntax is false*/
  /*val y = 6
  y = y + 5*/
  /*Best practise*/
  val a: Int = 5
  val b: Char = 'a'
  val c: Boolean = true
  val s: String = "Welcome Scala Practise Lesson!"
  /*Type Mismatch*/
  //  val len: Int = "hello"
  /* * * * * * * * * * * * * * * * * * * * * | IF ELSE | * * * * * * * * * * * * * * * * * * */
  val result = if (a > 3) "katta" else "kichik"
  println(result)
  val result2 = if (a > 3) {
    "katta"
  } else {
    "kichik"
  }
  println(result2)
  /* * * * * * * * * * * * * * * * * * * * * | Standard Input (StdIn) | * * * * * * * * * * * * * * * * * * */
  //  import scala.io.StdIn
  val str: String = StdIn.readLine("Iltimos nimadir kiriting: ")
  println("Kiritilgan satr " + str)
  //  s"hello $name" --> String interpolation
  println(s"Kiritilgan satr $str")
  /*Check weekdays*/
  println("Hafta kunini kiriting: ")
  val day: Byte = StdIn.readByte()
  if (day == 6 || day == 7) {
    println("Dam olish kuni")
  } else if (day >= 1 && day < 6) {
    println("Ish kuni")
  } else {
    println("Bunday hafta kuni yer sayyorasida mavjud emas!")
  }
  /* * * * * * * * * * * * * * * * * * * * * | Loops | * * * * * * * * * * * * * * * * * * */
  var counter = 0
  while (10 > counter) {
    println("Hello Scala!")
    counter += 1
  }
  //  Range - 1 to 10 - [1, 10]
  //  Range - 1 until 10 - [1, 10)
  for (i <- 1 to 10) {
    println(s"$i. Hello Scala!")
  }
  for (i <- 1 until 10) {
    println(s"$i. Hello Scala!")
  }
  val res = for (i <- 1 until 10) yield Math.pow(i, 2)
  println(res)
  /* * * * * * * * * * * * * * * * * * * * * | Math | * * * * * * * * * * * * * * * * * * */
  println(Math.PI)
  println(Math.E)
  println(Math.pow(2, 3))
  println(Math.max(23, 34))
  println(Math.abs(-12))
  //  Yaxlitlash
  println(Math.ceil(2.1))
  //  Yaxlitlash (Matematikadagi)
  println(Math.round(0.3))
  //  Butun qismini olish
  println(Math.floor(2.1))
  println(Math.min(12, 11))
  println(Math.sin(1 / 2))
  println(Math.cos(1 / 2))
  println(Math.tan(1 / 2))
  println(Math.exp(1))
}