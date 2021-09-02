//val result = for (i <- 1 to 5){
//  val v = i * i
//  v
//}
//
//val result1 = for (i <- 1 to 5) yield {
//  val v = i * i
//  v
//}
//
//val a = List(1,2,3,4,6)
//val result2 = for (i <- a) yield {
//  val v = i * i
//  v
//}

val a = Array(1, 2, 3, 4, 6)
val b = List('a', 'b', 'c', 'd', 'e')
val result3 = for (v1 <- b) yield {
  for (v2 <- a) yield {
    s"$v1 - $v2"
  }
}

result3.flatten

//optimisation version
val result4 = for (v1 <- a; v2 <- b) yield {
  s"$v1 - $v2"
}

val result5 = for {
  v1 <- a if v1 > 3 if v1 < 5
  v2 <- b
} yield {
  s"$v1 - $v2"
}
























