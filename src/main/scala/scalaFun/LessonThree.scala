package scalaFun

object LessonThree extends App {
  /*JVM -> Java Virtual Machine
  * SBT -> Scala Build Tool (Simple Build Tool)
  * REPL -> Read Eval Print Loop
  * Type inference -> Avtomatik tiplarni aniqlash
  *
  * 0.5 -> Double
  * 0.5f -> Float
  * */
  /*-----------------------|Method|-------------------------*/
  /*
  Scalada metod - bu nomga ega bo'lgan va uni dasturingizning boshqa joyidan chaqirish
  (shuningdek, murojaat qilish deb aytish mumkin) orqali bajarilishi mumkin bo'lgan statement
  (dasturlash tiliga nima qilish to'g'risida ko'rsatma beradigan ifoda) ya'ni bayonotlar bloki / qismidir.
  */
  /*
  * // 1 - usul
  def metodNomi(arg1: Tip1, ..., argN: TipN): MetodQaytaruvchiTip = { // def - kalit so'zi
    metod tanasi / statementlar / kod ...
  }
  // 2 - usul
  def metodNomi(arg1: Tip1, ..., arg2: TipN) = { // metod qaytaruvchi tipisiz e'lon qildik ikkala holat ham
  * yaroqli sintaksis
    metod tanasi / statementlar / kod ...
  }

  // def f(a: A): B
  // 1. def
  // 2.    - bo'sh joy
  // 3.  f - method nomi
  // 4.  ( - qavs ochamiz
  // 5.  a - o'zgaruvchi nomi parameter uchun
  // 6.  : - ikki nuqta
  // 7.    - bo'sh joy
  // 8.  A - argument tipi
  // 9.  ) - qavs yopamiz
  // 10.  : - ikki nuqta
  // 11.   - bo'sh joy
  // 12. B - qaytariladigan tip
  // def bo'sh joy method nomi qavs ochamiz o'zgaruvchi nomi parameter uchun ikki nuqta bo'sh joy parameter tipi qavs
  * yopamiz ikki bo'sh joy nuqta qaytariladigan tip*/
  def printGreeting(username: String): Unit = {
    println("Assalomu aleykum " + username)
  }

  printGreeting("Bob")
  printGreeting("Tom")
  printGreeting("Mark")

  /*
  * Scalada funksiya turlari ko'p (funksiya so'zi birinchi marta tilga olinishi), masalan,
  * 1. mavhum (abstract),
  * 2. aniq (concrete),
  * 3. anonim (anonymous),
  * 4. yuqori tartibli (high order),
  * 5. sof (pure),
  * 6. sof bo'lmagan (impure) va boshqalar.*/
  //  Berilgan butun sonning juftmi yoki yo'qligini aniqlaydigan metod:
  def isEven(number: Int): Boolean = number % 2 == 0

  println(isEven(5))
  println(isEven(24))

  //  Scalada metodlarni e'lon qilishda uning qaytaruvchi tipini yaqqol ifodalamaslik mumkin
  def isEven2(number: Int) = if (number % 2 == 0) true else false

  def metodNomi(param1: Double, param2: String = "Salom") = {
    println("param1 = " + param1 + " param2 = " + param2)
  }

  metodNomi(1, "Hello") // yaroqli
  metodNomi(1) // yaroqli
  metodNomi(param1 = 1) // yaroqli
  //  metodNomi(param2 = "Hello")   // kompilyatsiyada xatolik
  metodNomi(param1 = 1, param2 = "Hello") // yaroqli
  metodNomi(param2 = "Hello", param1 = 1) // yaroqli

  /*Quyidagilaridan qaysilari yaqorli ya'ni ishlaydigan sintaksisga ega:
  1. def myFunc(x) = x + 1
  2. def myFunc(x: Int) = x + 1
  3. def myFunc(x: Int = true): Int
  4. def myFunc(x: Int)
  5. def myFunc(x: Int): Int = x == 1
  6. def myFunc(x: Int) = x == 1*/
  //  Javob: 2-, 6- yaroqli

  /*--------------------------------|Class|-----------------------------*/
  /*
  * Class (Sinf) -> value, variable hamda methodlar kolleksiyasi
  * Object -> Class (Sinf) ning instance (examplyari)
  * Class -> Parametr berishimiz mumkin va u argument qabul qila oladi
  * Object -> argument qabul qila olmaydi*/

  class Greeting(x: Int) {
    val username: String = "Martin"

    def printGreeting(msg: String): Unit = {
      println(msg + " " + username + " " + x)
    }
  }

  val greeting = new Greeting(1)
  greeting.printGreeting("Assalomu aleykum")
  //  println(greeting.x) -> x parametr greeting obyektiga tegishli emas uni obyektga tegishli qilmoqchi bo`lsak val
  //  kalit so`zidan foydalanishimiz kerak bo`ladi

  //  val bilan sinf yaratish:
  class GreetingVal(val x: Int) {
    def printGreeting(msg: String): Unit = {
      println(msg + " " + x)
    }
  }

  val greetingVal = new GreetingVal(5)
  println(greetingVal.x)

  //  var bilan sinf yaratish:
  class GreetingVar(var x: Int) {
    def printGreeting(msg: String): Unit = {
      x += 1
      println(msg + " " + x)
    }
  }

  val greetingVar = new GreetingVar(1)
  greetingVar.printGreeting("Bob")

  /*Sintaksis
  * Classlarni e`lon qilishda UpperCamelCase dan foydalanish tavsiya etiladi
  * O`zgaruvchilar, obyeklar va methodlarni e`lon qilishda camelCase dan foydalanish tavsiya etiladi*/

  /*Boshqa sinfdan meros olish uchun, sinf parametrlari ro'yxatidan keyin extends kalit so'zdan foydalangan
  holda qilinadi. Biz buni Greeting sinfimiz uchun qilmaganmiz, shuning uchun u AnyRefdan meros olgan bo'ladi.
  Bu xuddi biz buni quyidagicha yozganimiz bilan bir xil:*/
  class GreetingNew(x: Int, y: Int) extends AnyRef

  class GreetingNew2(val x: Int, val y: Int) {
    // sinf tanasining qolgan qismi o'tkazib yuborilgan
    // Ko'pgina obyektga yo'naltirilgan tillarda bo'lgani kabi ota sinfga murojaat
    // qilish uchun super kalit so'zidan foydalanishingiz kerak. Bu yerda ota sinf AnyRef
    override def toString: String = "%s (x: %d, y: %d)".format(super.toString, x, y)
  }

  class GreetingTakomillashgan(lang: String = "O'zbek") {
    def printHello(username: String): Unit = ???
  }
  abstract class GreetingTakomillashgan2(lang: String = "O'zbek") {
    def printHello(username: String): Unit
  }
}
