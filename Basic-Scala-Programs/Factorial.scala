

object Factorial {
  def main(args: Array[String]){
    def factorial(n: Int): Int = {
      if (n == 0){
        return 1
      }
      else {
       return n * factorial(n - 1)
      }
    }
      val num = 5
      println(s"Factorial of $num is ${factorial(num)}")
  }
}