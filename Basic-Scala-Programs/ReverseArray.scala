

object ReverseArray {
  def main(args: Array[String]) {
    val arr = Array(1, 2, 3, 4, 5)
    val reversedArray = arr.reverse
    println(s"Reversed array: ${reversedArray.mkString(", ")}")
  }
}