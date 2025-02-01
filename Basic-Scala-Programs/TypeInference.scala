//Demonstrated type inference in Scala variables.

object TypeInference {
  def main(args: Array[String]) {
    val message = "Scala is powerful" //Inferred as String
    val year = 2024 // Inferred as Int
    val pi = 3.14 // Inferred as Double
    
    println(s"Message: $message, Year: $year, Pi: $pi")
    
  }
}