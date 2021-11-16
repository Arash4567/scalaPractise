package someting

object contest extends App {
  def diagonalDifference(arr: Array[Array[Int]]): Int = {
    // Write your code here
    var sum1 = 0
    var sum2 = 0
    for (i <- arr.indices) {
      sum1 += arr(i).toList(i);
      sum2 += arr(arr.length - i - 1).toList(i);
    }
    var res = sum1 - sum2
    if (res < 0) {
      res * -1
    } else {
      res
    }
  }

  def timeConversion(s: String): String = {
    // Write your code here
    if ((s.slice(8, 10) == "AM") && (s.slice(0, 2) equals "12")) {
      "00" + s.slice(2, 8)
    } else if (s.slice(8, 10) == "AM") {
      s.slice(0, 8)
    } else if ((s.slice(8, 10) == "PM") && (s.slice(0, 2) == "12")) {
      s.slice(0, 8)
    } else {
      var ans = s.slice(0, 2).toInt + 12
      ans + s.slice(2, 8)
    }
  }

  def gradingStudents(grades: Array[Int]): Array[Int] = {
    // Write your code here
    val a = for (i <- grades.indices) yield {
      var temp = ((grades(i) / 5).toInt + 1) * 5
      if (temp - grades(i) < 3 && temp > 35) {
        temp
      } else {
        grades(i)
      }
    }
    a.toArray
  }

  def f(arr: List[Int]): Int = {
    var sum = 0
    for (i <- arr.indices) {
      if (arr(i) % 2 != 0) {
        sum += arr(i)
      }
    }
    sum
  }

  def compareTriplets(a: Array[Int], b: Array[Int]): Array[Int] = {
    // Write your code here
    var alice_score = 0
    var bob_score = 0
    for (i <- a.indices) {
      if (a(i) > b(i)) alice_score += 1
      if (a(i) < b(i)) bob_score += 1
    }
    Array(alice_score, bob_score)

  }

  def birthdayCakeCandles(candles: Array[Int]): Int = {
    // Write your code here
    val maxx = candles.toList.max
    candles.count {
      _ == maxx
    }

  }

  def bonAppetit(bill: Array[Int], k: Int, b: Int) {
    // Write your code here
    val temp = bill.filter(_ != bill(k)).sum / 2
    if (temp == b) {
      println("Bon Appetit")
    } else {
      println(b - temp)
    }
  }


  def miniMaxSum(arr: Array[Int]) {
    // Write your code here
    val aaa = arr.sum
    val minn = aaa - arr.max
    val maxx = aaa - arr.min
    println(s"${minn.toLong} ${maxx.toLong}")
  }

  miniMaxSum(Array(1, 5, 456, 456, 45, 12, 5))

}
