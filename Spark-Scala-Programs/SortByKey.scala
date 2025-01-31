import org.apache.spark.sql.SparkSession

object SortByKey {
  def main(args: Array[String]) {
    val spark = SparkSession.builder()
      .master("local[1]")
      .appName("Sort By Key")
      .getOrCreate()
      
    val rdd = spark.sparkContext.parallelize(Seq((3, "C"), (1, "A"), (2, "B")))
    
    val sortedRdd = rdd.sortByKey()
    sortedRdd.collect().foreach { case (key, value) => 
      println(s"$key -> $value")
    }
    
    spark.stop()
  }
}