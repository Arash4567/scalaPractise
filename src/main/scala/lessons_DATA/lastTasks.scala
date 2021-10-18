package lessons_DATA

object lastTasks extends App{

  def timeConversion(s: String): String = {
    // Write your code here
    if ((s.slice(8, 10) == "AM") && (s.slice(0, 2) == "12")) {
      "00" + s.slice(2, 8)
    } else if (s.slice(8, 10) == "AM"){
      s.slice(0, 8)
    } else if ((s.slice(8, 10) == "PM") && (s.slice(0, 2) == "12")){
      s.slice(0, 8)
    } else {
      var ans = s.slice(0, 2).toInt + 12
      ans + s.slice(2, 8)
    }
  }
  println(timeConversion("12:40:22AM"))

  def diagonalDifference(arr: Array[Array[Int]]): Int = {
    // Write your code here
    var sum1 = 0
    var sum2 = 0
    for (i <- arr.indices){
      sum1 += arr(i).toList(i);
      sum2 += arr(arr.length - i - 1).toList(i);
    }
    var res = sum1 - sum2
    if (res < 0){
      res * -1
    } else {
      res
    }
  }

}
