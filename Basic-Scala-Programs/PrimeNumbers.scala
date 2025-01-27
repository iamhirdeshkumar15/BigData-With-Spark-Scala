

object PrimeNumbers {
  def main(args: Array[String]) {
    def isPrime(n: Int): Boolean = {
      if (n <= 1){
        return false
      }
      else {
        return (!(2 until n).exists(x => n % x == 0))
      }
    }
    val range = 10 to 30
    println("Prime numbers between 10 and 30:")
    for (i <- range) {
      if (isPrime(i)){
        println(i)
      }
    }
  }
}