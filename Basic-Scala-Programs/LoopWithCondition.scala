// Used loop with condition filtering.

object LoopWithCondition {
  def main(args: Array[String]) {
    for(i <- 1 to 10 if i % 2 == 0) {
      println(s"Even Number: $i")
    }
  }
}