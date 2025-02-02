

object LazyVal {
  def main(args: Array[String]) {
    lazy val expensiveComputation: Int = {
      println("Computing value...")
      42 * 2
    }
    
    println("Before accessing lazy val")
    println(s"Computed value: $expensiveComputation") //Computation happens here
  }
}