

object ImmutableVariableExample {
  def main(args: Array[String]){
    val pi: Double = 3.14159
    println(s"Value of pi: $pi")
    
    // Uncommenting the next line will cause an error
    // pi = 3.14
  }
}