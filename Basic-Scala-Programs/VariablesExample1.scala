

object VariablesExample1 {
  def main(args: Array[String]){
    val immutableVar: String = "Hello, Scala!" // Cannot be changed
    var mutableVar: Int = 10  //Can be changed
    
    println(s"Immutable Variable: $immutableVar")
    println(s"Mutable Variable before change: $mutableVar")
    
    mutableVar = 20 // Allowed for 'var'
    println(s"Mutable Variable after change: $mutableVar")
  }
}