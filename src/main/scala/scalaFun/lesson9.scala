package scalaFun

import scala.annotation.tailrec

object lesson9 extends App {
  //List(1, 2, 3)
  //++
  //+:
  //:+
  //mutable
  //immutable
  //++:
  //:++
  //.length
  //.size
  //.sum
  //.max
  //.min
  //Seq(1, 2, 3)
  //
  //List() <=> Nil
  //
  /*-------------------------------------------*/
  //Pattern Matching with Collection
  case class User(firstname: String, lastname: String)

  val user1 = User("user1F", "user1F")
  val user2 = User("user2F", "user2F")
  val user3 = User("user3F", "user3F")

  val list: List[User] = user1 :: user2 :: user3 :: Nil

  @tailrec
  def go(users: List[User], acc: List[User]): List[User] = users match {
    case h :: tail => if (h.firstname.contains("1")) {
      go(tail, acc :+ User("user2", h.lastname))
    } else if (h.firstname.contains("3")) {
      go(tail, acc :+ User("user6", h.lastname))
    } else {
      go(tail, acc :+ h)
    }
  }

  @tailrec
  def go2(users: List[User], acc: List[User]): List[User] = users match {
    case h :: tail if (h.firstname.exists(s => s == "1" || s == "3")) =>
      go2(tail, acc :+ User("userMultiplied", h.lastname))
    case h :: tail => go2(tail, acc :+ h)
    case Nil => acc
  }

  /*-------------------------------------------*/
  val either1: Either[String, Int] = Right(3)
  val either2: Either[String, Int] = Left("error")

  sealed trait Userable

  final case class Student(firstname: String, lastname: String) extends Userable

  final case class Teacher(firstname: String, lastname: String) extends Userable

  final case class Worker(firstname: String, lastname: String) extends Userable

  final case class Doctor(firstname: String, lastname: String) extends Userable

  val student = Student("s", "sl")
  val teacher = Teacher("t", "tl")
  val worker = Worker("w", "wl")
  val doctor = Doctor("d", "dl")

  val people: List[Userable] = List(student, teacher, worker, doctor)
  //head
  //last
  //tail
  //
  //Pattern matchingni arraylarda listga o'xshab ishlatib bo'lmidi
  /* SET */
  val set1 = Set(1, 213, 2, 3, 4, 4)
  val set2 = Set(1, 213, 2, 3, 4, 4)
  val res: Set[Int] = set1 ++ set2
  println(res)

  val res2 = set1 + 5
  val res3 = set1 - 213

  /* Map */
  val map: Map[String, Int] = Map("a" -> 2, "b" -> 3)

  val map2 = map + ("c" -> 4)
  val map3 = map2 - "a"

  /*
  * List[Student] => List[Excellencies]
  * List[Student] => List[Genderable] - Genderable - ADT
  * List[A] => List[B]
  * Seq[A] => Seq[B]
  * Set[A] => Set[B]
  * */

  final case class Learner(firstname: String, lastname: String, email: String, age: Int, phone: String, score: Int, gender: String)

  final case class Excellence(firstname: String, lastname: String, phone: String)

  sealed trait Genderable

  final case class Man(firstname: String, lastname: String) extends Genderable

  final case class Woman(firstname: String, lastname: String) extends Genderable

  val learner1 = Learner("Jack1", "Ma", "jackma1@gmail.com", 21, "+998991234567", 86, "Male")
  val learner2 = Learner("Jessica1", "Ma", "jassicama1@gmail.com", 18, "+998991239567", 85, "Female")
  val learner3 = Learner("Jack2", "Ma", "jackma2@gmail.com", 32, "+998991234567", 56, "Male")
  val learner4 = Learner("Jessica2", "Ma", "jassicama2@gmail.com", 22, "+998991234567", 74, "Female")
  val learner5 = Learner("Jack3", "Ma", "jackma3@gmail.com", 28, "+998991234897", 62, "Male")
  val learner6 = Learner("Jessica3", "Ma", "jassicama3@gmail.com", 15, "+998991234567", 28, "Female")

  val learners: List[Learner] = learner1 :: learner2 :: learner3 :: learner4 :: learner5 :: Nil
  val excellencies = learners.filter(filterByScoreAndAge).map(learnerToExcellence)

  def learnerToExcellence(learner: Learner): Excellence =
    Excellence(
      firstname = learner.firstname,
      lastname = learner.lastname,
      phone = learner.phone
    )

  def filterByScoreAndAge(learner: Learner): Boolean = learner.score > 86 && learner.age >= 18 && learner.age <= 23

  def learnerGen: List[Genderable] = learners.map {
    learner =>
      if (learner.gender == "Male")
        Man(learner.firstname, learner.lastname)
      else
        Woman(learner.firstname, learner.lastname)
  }
}