package scalaFun.Examples
object discount extends App {
  /* Quyidagi shartlar asosida ekranga berilgan chegirmani chiqarish dasturini tuzing:

   -  agar xarid qilingan tovarlarning umumiy summasi 500 ming so'mdan kam bo'lsa
      0% chegirma - "Sizga chegirma yo'q"

   -  agar xarid qilingan tovarlarning umumiy summasi 500 ming so'mdan ko'p ammo
   1 million so'mdan kam bo'lsa 10% chegirma  - "Sizga 10% chegirma, ya'ni XXX summani to'laysiz"

   -  agar xarid qilingan tovarlarning umumiy summasi kamida bir million bo'lsa
    15% chegirma  - "Sizga 15 % chegirma, ya'ni XXX summani to'laysiz"*/
  val ummumiySumma: Long = 1000000
  val natija = if (ummumiySumma < 500000)
    "Sizga chegirma yo'q"
  else if (ummumiySumma >= 500000 && ummumiySumma < 1000000)
    s"Sizga 10% chegirma, ya'ni ${ummumiySumma * (1 - 0.1)} to'laysiz"
  else
    s"Sizga 15% chegirma, ya'ni ${ummumiySumma * (1 - 0.15)} to'laysiz"

  println(natija)
}
