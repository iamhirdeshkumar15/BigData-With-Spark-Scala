

object MultiplicationTable {
  def main(args: Array[String]) {
    val num = 5
    for (i <- 1 to 10) {
      println(s"$num * $i = ${num * i}")
    }
  }
}