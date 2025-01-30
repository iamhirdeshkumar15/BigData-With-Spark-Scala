import org.apache.spark.sql.SparkSession

object SumReduce {
  def main(args: Array[String]) {
    val spark = SparkSession.builder()
      .master("local[1]")
      .appName("Sum Reduce")
      .getOrCreate()
      
    val rdd = spark.sparkContext.parallelize(Seq(1, 2, 3, 4, 5))
    
    val sum = rdd.reduce(_+_)
    println(s"Sum of elements: $sum")
    
    spark.stop()
        
  }
}