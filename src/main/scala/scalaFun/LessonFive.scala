package scalaFun

object LessonFive extends App {
  //  case class Man(firstName: String, lastName: String, email: String, birthDate: String, age: Int, gender: Gender)
  //
  //  object Man {
  //    def apply(firstName: String, lastName: String, email: String, birthDate: String, age: Int, gender: Gender) = {
  //      require(gender == Male)
  //      new Man(firstName, lastName, email, birthDate, age, gender)
  //    }
  //  }

  // case class Person(firstName: String, lastName: String, email: String, birthDate: String,  age: Int)
  // object Person {
  //   def apply(firstName: String, lastName: String, email: String, birthDate: String,  age: Int): Person = {
  //     new Person(firstName, lastName, email, birthDate, age)
  //   }
  // }
  // val person1 = Person.apply("Navro'z", "navruz@gmail.com", "Safarbayev", "15-12-1995", 15)
  // val person2 = Person.apply("Navro'z", "navruz@gmail.com", "Safarbayev", "15-12-1995", 19)
  // println(person2)
  // println(person1)

  //  sealed abstract class Gender
  //
  //  case object Male extends Gender
  //
  //  case object Female extends Gender
  //
  //  sealed abstract class TrafficLight
  //
  //  case object Red extends TrafficLight
  //
  //  case object Green extends TrafficLight
  //
  //  case object Yellow extends TrafficLight
  //
  //  sealed trait WeekDay
  //
  //  case object Monday extends WeekDay
  //
  //  case object Tuesday extends WeekDay
  //
  //  case object Saturday extends WeekDay
  //
  //  case object Sunday extends WeekDay
  //
  //  def checkWeekend(weekDay: WeekDay): Boolean = {
  //    weekDay == Sunday || weekDay == Saturday
  //  }
  //
  //  println(checkWeekend(Saturday))
  //  println(checkWeekend(Monday))
  //
  //  def canGo(trafficLight: TrafficLight): Boolean = {
  //    trafficLight == Green
  //  }
  //
  //  def canStop(trafficLight: TrafficLight): Boolean = {
  //    trafficLight == Red
  //  }
  //
  //  def readyToGoOrReadyToStop(trafficLight: TrafficLight): Boolean = {
  //    trafficLight == Yellow
  //  }
  //
  //  val green = Green
  //  val red = Red
  //  val yellow = Yellow
  //
  //  println(canGo(green))
  //  println(readyToGoOrReadyToStop(red))
  //  println(readyToGoOrReadyToStop(yellow))

  // toString
  // equals -> ==
  // hashCode
  // copy
  // companion obejct
  // apply
  // unapply

  // trait
  // multiple inheritence with key word
  // case class & case object
  // sealed

  //  abstract class vs trait
  //  trait -> xususiyat (xarakteristika)
  //  trait -> sifat (Adjective)
  //  trait nomi UpperCamelCase
  //  trait Sleepable {
  //    body
  //    fields & methods

  //  }
  //  trait Runnable{
  //    def canWalk():Boolean = ???
  //    def canRun():Boolean = ???
  //  }
  //  class Dog extends Sleepable with
  /* class Vehicle(speed: Int) {
     val mph: Int = speed

     def race(): Unit = println("Racing")
   }

   class Car(speed: Int) extends Vehicle(speed) {
     override val mph: Int = speed

     override def race(): Unit = println("Racing Car")
   }

   class Bike(speed: Int) extends Vehicle(speed) {
     override val mph: Int = speed

     override def race(): Unit = println("Racing Bike")
   }*/
  /*trait Start {
    def canStart(car: String): Unit = println(s"$car yura oladi!")
  }
  trait Stop {
    def canStop(car: String): Unit = println(s"$car to`xtay oladi!")
  }
  class Car extends Start with Stop
  val bike = new Car
  bike.canStart("Dugati")
  bike.canStop("Dugati")*/
//    trait Start {
//      def canStart(car: String): Unit = println(s"$car yura oladi!")
//    }
//
//    trait Stop {
//      def canStop(car: String): Unit = println(s"$car to`xtay oladi!")
//    }
//
//    class Car extends Start with Stop
//
//    val bike = new Car
//    bike.canStart("Dugati")
//    bike.canStop("Dugati")

  //  trait TraitName {
  //    //    maydonlar
  //    //    metodlar
  //  }

  //  sealed trait WeekDay
  //  case object Monday extends WeekDay
  //  case object Tuesday extends WeekDay
  //  case object Wednesday extends WeekDay
  //  case object Thursday extends WeekDay
  //  case object Friday extends WeekDay
  //  case object Saturday extends WeekDay
  //  case object Sunday extends WeekDay
  //
  //  sealed trait Weather
  //  case object Sunny extends Weather
  //  case object Windy extends Weather
  //  case object Rainy extends Weather
  //  case object Cloudy extends Weather
  //  case object Foggy extends Weather
  case class Pencil(quantity: Int, color: String)

  //  trait A {
  //    val b: Int
  //  }
  //
  //  trait B {
  //    val c: String
  //  }
  //
  //  val a = new A with B {
  //    val b = 5
  //    val c = "Anonymous class"
  //  }
  //  println(a.b)
  //  println(a.c)

  //  abstract class C {
  //    val b: Int
  //  }
  //
  //  abstract class D extends C {
  //    val c: String
  //  }
  //  val a = new D {
  //    override val b:Int = 5
  //    override val c:String = "Concrete class"
  //  }
  //  println(a.b)
  //  println(a.c)

  //  lazy val bir marta instalization bo`ladi
  //  def har safar chaqirganimizda instalization bo`ladi
  //  class AA {
  //    var i: Int = 0
  //    lazy val a: Unit = {
  //      AA.this.i = AA.this.i.+(1)
  //    }
  //  }
  //  val aaa = new AA
  //  println(aaa.a)
  //  println(aaa.i)
  //  println(aaa.a)
  //  println(aaa.i)

  //  class AAA {
  //    var i = 0
  //    def aa(): Unit = {
  //      AAA.this.i = AAA.this.i.+(1)
  //    }
  //  }
  //  val ccc = new AAA
  //  println(ccc.aa)
  //  println(ccc.i)
  //  println(ccc.aa)
  //  println(ccc.i)
  println(Option(List()).toList.flatten)

}
