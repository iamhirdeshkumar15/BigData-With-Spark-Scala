

object CheckPrime {
  def main(args: Array[String]) {
    def isPrime(n: Int): Boolean = {
      if (n <= 1) false
      else !(2 until n).exists(x => n % x == 0)
    }
    val num = 17
    if (isPrime(num)) {
      println(s"$num is a Prime number.")
    }
    else {
      println(s"$num is not a Prime Number.")
    }
  }
}