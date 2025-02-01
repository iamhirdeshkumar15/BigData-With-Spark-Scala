//Added basic variable declaration and usage in Scala.

object VariablesExample {
  def main(args: Array[String]) {
    val name: String = " Hirdesh"
    var age: Int = 25
    val height: Double = 5.9
    var isStudent: Boolean = true
    
    println(s"Name: $name, Age: $age, Height: $height, Student: $isStudent")
    
    age += 1 //updating variable
    println(s"Updated age: $age")
    
  }
}