import org.apache.spark.sql.SparkSession

object JoinOperations {
  def main(args: Array[String]) {
    val spark = SparkSession.builder()
      .master("local[1]")
      .appName("Join Operations")
      .getOrCreate()
      
    val rdd1 = spark.sparkContext.parallelize(Seq((1, "A"), (2, "B"), (3, "C")))
    val rdd2 = spark.sparkContext.parallelize(Seq((1, "X"), (2, "Y"), (4, "Z")))
    
    val joinedRdd = rdd1.join(rdd2)
    joinedRdd.collect().foreach{ case (key, (val1, val2)) =>
      println(s"$key -> ($val1, $val2)")
    }
    
    spark.stop()
  }
}