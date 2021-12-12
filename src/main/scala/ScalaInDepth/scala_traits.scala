package ScalaInDepth

object scala_traits extends App {
  //  Trait -> encapsulates methods and field definitions
  //  Don`t create object in trait
  //  Only to use multiple inheritances with trait
  //  class only single inheritances
  //  implement -> yaratilayotdan kodni tanasi bilan to`liq yaratish
  //  unimplemented methods in trait should be implemented in class extending given trait

  //  trait Car {
  //    def engine(): Unit = println("1000 cc")
  //
  //    def wheels(): Unit
  //
  //    def breaks(): Unit
  //  }
  //
  //  class Mercedes extends Car {
  //    override def wheels(): Unit = {
  //      println("4 wheels")
  //    }
  //
  //    override def breaks(): Unit = {
  //      println("Disk breaks")
  //    }
  //  }

  trait Vehicle {
    def breaks():Unit = println("A")
  }
  trait Car {
    def breaks():Unit = println("B")
  }

  class Bugatti extends Vehicle with Car {
    override def breaks(): Unit = super.breaks()
  }
  val a = new Bugatti
  a.breaks()
}
