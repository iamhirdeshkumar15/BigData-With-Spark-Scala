

object MutableVariableExample {
  def main(args: Array[String]) {
    var counter: Int = 0
    println(s"Initial Counter: $counter")
    
    counter += 1
    println(s"Updated Counter: $counter")
  }
}