package scalaFun.Examples

object lesson1to3 extends App {
  val x: Int = 1
  println(x + 2)
  //  x = 3 -> immutable bo`lgani uchun o`zgartirib bilmaymiz
  var y: Int = 5
  println(y)
  y = 15
  println(y)
  //  val myLength: Int = "My length should be Int"
  //  type mismatch xatoligi chiqadi chunki Int tipidagi o`zgaruvchiga String tipidagi o`zgaruvchini yuklab qo`ydik
  val myLength: Int = "My length should be Int".length //Ushbu holat to`g`ri yozilgan sintaksis hisoblanadi
  //  += -=
  var z: Int = 5
  z = z + 12
  z += 12

  z = z - 3
  z -= 3

  /*
  1. val x: Any = 2.0
  2. val x: Int = 2.0
  3. val x: Double = 2.0
  */
  // Javob: 1-,3- yaroqli sintaksis, 2-xato sintaksis

  //  Ushbu += operatorini String tipdagi var o'zgaruvchi uchun foydalana olamizmi?
  //  Javob: Ha ishlay oladi
  var s: String = "Hello "
  s += "Scala"
  println(s)
  //  Bu -= operator haqida nima deb o'ylaysiz?
  //  Javob: Yo`q ishlay olmaydi

  //  Boshqa dasturlash tillaridagidek ternary operatori Scalada mavjud emas ammo quyidagicha sintaksis mavjud
  //  JavaScript: 1 > 0 ? "Rost" : "Yolg'on";
  val natija: String = if (1 > 0) "Rost" else "Yolg'on"
  println(natija)

  val a: Int = 42
  val b: Int = {
    42
  }
  //  a va b larga ikkala holatda ham bir xil amal bajarilyapti, demak biz {} (figurali qavs)ni
  //  ehtiyojga qarab ishlatishimiz kerak

  //  Quyidagi ifodani kompilyatsiya qilish mumkini? Uning natijasi qanday?
  for (a <- "salom") println(a)
  //  Javob: "salom" so`zidagi harflar ustun shaklida consoleda chiqadi

}
