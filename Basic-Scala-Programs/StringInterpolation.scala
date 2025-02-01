// Implemented string interpolation examples.

object StringInterpolation {
  def main(args: Array[String]) {
    val name = "Kumar"
    val age = 25
    
    println(s"My name is $name and I am $age years old.")
    println(f"Pi value is approximately ${math.Pi}%.2f")
  }
}