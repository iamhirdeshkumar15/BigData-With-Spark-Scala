

object EvenOddCheck {
  def main(args: Array[String]) {
    val num = 100
    if (num % 2 == 0) {
      println(s"$num is even number")
    }
    else {
      println(s"$num is odd number")
    }
  }
}