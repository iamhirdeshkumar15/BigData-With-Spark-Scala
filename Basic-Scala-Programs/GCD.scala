

object GCD {
  def main(args: Array[String]) {
    def gcd(a: Int, b: Int): Int= {
      if (b == 0 ) a
      else gcd(b, a % b)
    }
    
    val num1 = 56
    val num2 = 98
    println(s"GCD of $num1 and $num2 is ${gcd(num1, num2)}")
  }
}