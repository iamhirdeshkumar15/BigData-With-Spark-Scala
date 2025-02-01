// Compared mutable and immutable variables in Scala.

object MutableVsImmutable {
  def main(args: Array[String]) {
    val immutableVar = "I cannot change" //Immutable
    var mutableVar = "I can change" //Mutable
    
    println(s"Immutable : $immutableVar")
    println(s"Before Change: $mutableVar")
    mutableVar = "I have changed"
    println(s"After Change: $mutableVar")
  }
}