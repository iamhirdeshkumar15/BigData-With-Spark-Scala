

object DynamicMultiplicationTable {
  def main(args: Array[String]) {
    val num = 7 // You can change this number
    println(s"Multiplication table of $num: ")
    for (i <- 1 to 10) {
      println(s"$num * $i = ${num * i}")
    }
  }
}