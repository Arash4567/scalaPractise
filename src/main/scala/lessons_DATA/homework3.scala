package lessons_DATA

object homework3 extends App {

  case class Notebook(
                       model: String,
                       cpu: String,
                       year: Int,
                       price: Double
                     )

  val notebook1 = Notebook("Acer", "i7", 2018, 800)
  val notebook11 = Notebook("Acer", "i5", 2018, 650)
  val notebook2 = Notebook("Lenovo", "i3", 2019, 900)
  val notebook3 = Notebook("Dell", "i5", 2020, 1000)
  val notebook4 = Notebook("HP", "i7", 2021, 1300)
  val notebook5 = Notebook("Macbook", "i9", 2017, 940)
  val notebook6 = Notebook("MSI", "i3", 2016, 999)
  val notebook7 = Notebook("Asus", "i5", 2021, 780)
  val notebookList = List(notebook1, notebook11, notebook2, notebook3, notebook4, notebook5, notebook6, notebook7)
  val res1 = notebookList.groupBy(_.model)
  //  1
  println(res1)
  //  2
  val res3 = notebookList.groupBy(_.price)
  val ss = res3.keys.toList.sorted.reverse
  println(res3(ss.head).head.model)
  // 3
  val res2 = notebookList.groupBy(_.price).keys.toList.sum
  println(res2)
  //  4
  val res4 = notebookList.groupBy(_.cpu).filter(_._1 == "i7")
  println(res4)
}