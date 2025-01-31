

object CountOccurrences {
  def main(args: Array[String]) {
    val arr = Array(1, 2, 2, 3, 3, 3, 3, 3, 4, 5)
    val element = 3
    val count = arr.count(_ == element)
    println(s"The element '$element' appears $count times in the array.")
  }
}