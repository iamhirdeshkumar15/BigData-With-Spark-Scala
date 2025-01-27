

object FibonacciSeries {
  def main(args: Array[String]) {
    def fibonacci(n: Int): Int = {
      if (n <= 1){
        return n
      }
      else{
        return fibonacci(n - 1) + fibonacci(n - 2)
      }
    }
    val num = 10
    for (i <- 0 until num) {
      println(s"${fibonacci(i)}")
    }
  }
}