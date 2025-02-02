// Implemented string interpolation examples.

object StringInterpolation {
  def main(args: Array[String]) {
    val name = "Kumar"
    val age = 25
    val height = 5.9
    
    // S-Interpolation
    println(s"My name is $name and I am $age years old.")
    // F-Interpolation (for formatted strings)
    println(f"Pi value is approximately ${math.Pi}%.2f")
    
    // Raw-Interpolation
    println(raw"New Line Example: \n This will not be interpreted")
    
  }
}