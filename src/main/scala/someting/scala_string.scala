package someting

object scala_string {
  val test1: String = "Hello "
  val test2: String = "Uzbekistan!"

  def main(args: Array[String]): Unit = {
//    println(test1.length())
//    println(test1.concat(test2))
//    println(test1 + test2)
    /* print fString using any parameter*/
    /* %d -> for Integer number
    * %f -> for Double number
    * %s -> for String */

    // val num1 = 456
    // val num2 = 23.131
    // val result = printf("(%d -- %f -- %s)", num1, num2, test1)
    // println(result)
    // println("(%d -- %f -- %s)".format(num1, num2, test1))
    //    Create multiline String
    val foo =
    """This is
      a multiline
      String"""
//    println(foo)

    val sss =
      """Uzbekistan
        |kelajagi
        |buyuk
        |davlat!""".stripMargin
//    println(sss)
    val sss1 =
      """Uzbekistan
        #kelajagi
        #buyuk
        #davlat!""".stripMargin('#')
//    println(sss1)
    val speech = """Four score and
                   |seven years ago
                   |our fathers""".stripMargin.replaceAll("\n", " ")
//    println(speech)
    val s = """This is known as a
              |"multiline" string
              |or 'heredoc' syntax.""". stripMargin.replaceAll("\n", " ")
//    println(s)
    val sd = "hello world".split(" ")
//    println(sd.foreach(println))

//    test2.foreach(println);
//    for (c <- test2) println(c);
//      test2.getBytes().foreach(println);
    val res1 = test2.filter(_ != 'U')
//    println(res1)

    val res2 = test2.drop(4)
//    println(res2)

    val res3 = test2.take(5)
//    println(res3)

//    println(test2.capitalize)
//    println(test2.toLowerCase())
//    println(test2.toUpperCase())

    val s1 = "Hello"
    val s2  = "H" + "ello"
//    println(s1 == s2)

//    println(s1.equalsIgnoreCase("hello"))

    val s3 = "hello world"
//    println(s3.split(" ").toList) //String argument
//    println(s3.split(' ').toList) //Char argument

    val s4 = "eggs, milk, butter, Coco Puffs"
//    println(s4.split(",").toList)
//    println(s4.split(",").map(_.trim).toList) //delete white space
    val s5 = "hello world, this is Al".split("\\s+")
//    println(s5.toList)

    val name = "Fred"
    val age = 33
    val weight = 68

//    println(s"$name is $age years old, and weighs $weight kg!")
//    println(s"${age + 1}")
//    println(s"${age == 33}")

    val num = 12.45665
//    println(f"number = $num%.2f") //.dan keyin 2 sonni olish
//    println(f"number = $num%.0f") //faqat butun qismini olish

    val sString = s"foo\nbar"
//    println(sString)

    val rawString = raw"foo\nbar"
//    println(rawString)

   /* Common printf style format specifiers
    | Format specifier |              Description            |
    ----------------------------------------------------------
    |        %c        | Character                           |
    |        %d        | Decimal number (integer, base 10)   |
    |        %e        | Exponential floating-point number   |
    |        %f        | Floating-point number               |
    |        %i        | Integer (base 10)                   |
    |        %o        | Octal number (base 8)               |
    |        %s        | A string of characters              |
    |        %u        | Unsigned decimal (integer) number   |
    |        %x        | Hexadecimal number (base 16)        |
    |        %%        | Print a “percent” character         |
    |        \%        | Print a “percent” character         |
    __________________________________________________________
    */
   val result = for {
     c <- "hello, world"
     if c != 'l'
   } yield c.toUpper
//    println(result)

    val result2 = "hello, world".filter(_ != 'l').map(_.toUpper)
//    println(result2)


    // first example
    val encrypt = "HELLO".map(c => (c.toByte+15).toChar)
    // second example
    val decrypt = encrypt.map{ c =>
      (c.toByte-15).toChar
    }
    println(encrypt)
    println(decrypt)
  }
}
