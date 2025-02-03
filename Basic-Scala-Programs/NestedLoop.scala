// Implemented nested loops in Scala.

object NestedLoop {
  def main(args: Array[String]) {
    for (i <- 1 to 3; j <- 1 to 3) {
      println(s"i = $i, j = $j")
    }
  }
}