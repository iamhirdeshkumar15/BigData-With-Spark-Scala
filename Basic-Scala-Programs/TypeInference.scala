//Demonstrated type inference in Scala variables.

object TypeInference {
  def main(args: Array[String]) {
    val message = "Scala is powerful" // Scala infers type as String
    val year = 2024 // Scala infers type as Int
    val pi = 3.14 // Scala infers type as Double
    val inferredString = "Type Inference" // Scala infers type as String
    
    println(s"Message: $message, Year: $year, Pi: $pi, String: $inferredString")
    
  }
}