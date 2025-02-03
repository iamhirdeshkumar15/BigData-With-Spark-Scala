// Implemented do-while loop in Scala

object DoWhileLoop {
  def main(args: Array[String]) {
    var count = 1
    do {
      println(s"Do-While Loop Count: $count")
      count += 1
    } while (count <= 5)
  }
}