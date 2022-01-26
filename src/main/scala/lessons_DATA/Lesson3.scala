package lessons_DATA

object Lesson3 extends App {

  case class Student(name: String, age: Int, direction: List[String])
  case class Teacher(name: String = "Temur", age: Int, direction: List[String], tel: String)

  val akaml = Teacher(name = "Akmal", age = 34, direction = List("Web App"), tel = "+9999999")
  println(akaml)

  val tohir = Student("Tohir", 22, List("Frontend"))
  val akbar = Student("Akbar", 23, List("Backend"))
  val shuxrat = Student("Shuhrat", 22, List("Frontend"))
  val kamol = Student("Kamol", 22, List("Frontend"))
  val doniyor = Student("Doniyor", 22, List("Frontend"))

  val studentDirection = akbar match {
    case Student(_, _, List("Backend")) =>
      "Backend"
    case Student("Akbar", _, _) =>
      "Akbar"
    case _ =>
      "Topilmadi "
  }

  println(s"studentDirection: $studentDirection")

  val studentName = akbar match {
    case Student("Tohir", _, _) =>
      "Tohir"
    case Student("Akbar", _, _) =>
      "Akbar"
    case _ =>
      "Topilmadi "
  }

  println(s"studentName: $studentName")

  val doniyorTuple: (String, Int, List[String]) = (doniyor.name, doniyor.age, doniyor.direction)
  val doniyorTupleAge = doniyorTuple._2
  println(s"doniyorTuple: $doniyorTuple")
  println(s"doniyorTupleAge: $doniyorTupleAge")

  val doniyorAge = doniyor.age
  val doniyorName = doniyor.name
  println(s"Doniyor Age: $doniyorAge")
  println(s"Doniyor Name: $doniyorName")

  val allStudent = List(shuxrat, akbar, tohir, kamol, doniyor)

  val diffStudent = if (tohir == akbar) {
    "Student teng"
  } else {
    "teng emas"
  }

  val nameStudent = allStudent.groupBy(_.name)

  println(s"nameStudent: $nameStudent")
//  println(s"diffStudent: $diffStudent")
//  println(s"allStudent: $allStudent")

  val t: ((String, Int, List[String])) => Student = (Student.apply _).tupled

}
