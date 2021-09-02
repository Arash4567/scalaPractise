/*
Kiritilgan 0 dan 5 gacha sonlarni mos belgilar bilan, qolgan barcha qiymatlari z harfi bilan
almashtiruvchi dastur tuzilsin
*/
import scala.io.StdIn._
object solve2 {
    def main(args: Array[String]){
        val result = readInt()
        result match {
            case 0 | 1 | 2 | 3 | 4 | 5 => println(result.toChar)
            case _ => println("z")
        }
        
    }
}