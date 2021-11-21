package scalaFun.Examples

import scala.io.StdIn

/*object checkWeekdays extends App {
  println("Haft kunini kiriting")
  val haftaKuni = StdIn.readInt()
  if (haftaKuni == 6 || haftaKuni == 7) {
    println("Bugun dam olish kuni")
  } else if (haftaKuni >= 1 && haftaKuni < 6) {
    println("Bugun ish kuni")
  } else {
    println("Bunday hafta kuni yer sayyorasida mavjud emas!")
  }
}*/

object checkWeekdays extends App {
  println("Haft kunini kiriting")
  val haftaKuni = StdIn.readInt()
  if (haftaKuni == 6 || haftaKuni == 7)
    println("Bugun dam olish kuni")
  else if (haftaKuni >= 1 && haftaKuni < 6)
    println("Bugun ish kuni")
  else
    println("Bunday hafta kuni mavjud emas!")
}
