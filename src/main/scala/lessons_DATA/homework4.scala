package lessons_DATA

object homework4 extends App{
  def exampleTask1(): Unit = {
    val list = List(5, 7, 15, 50, 55, 21, 37)
    println(list.filter(_ % 3 == 0))
  }
  exampleTask1()

  def exampleTask2(): Unit = {
    val list = List(5, 7, 15, 50, 55, 21, 37)
    for {
      (el, index) <- list.zipWithIndex
      if index < list.length - 1 && (el + list(index + 1)) % 2 == 0
    } {
      println(s"i1 = $el | i1 = ${list(index + 1)}")
    }
  }
  exampleTask2()

  def exampleTask3(): Unit = {
    val list = List(5, 7, 15, 50, 55, 21, 37)
    val res3 = for (i <- list.length - 1 to 0 by -1) yield {
      list(i)
    }
    println(res3.toList)
  }
  exampleTask3()

  def exampleTask4(): Unit = {
    val list = List(5, 7, 15, 50, 55, 21, 37)
    println(list.zipWithIndex.filter(i => i._2 % 2 != 0).map(_._1))
  }
  exampleTask4()

  def exampleTask5(): Unit = {
    val list = List(5, 7, 15, 50, 55, 21, 37)
    var s = 0
    list.foreach(i => s += i)
    println(s)
  }
  exampleTask5()
}
