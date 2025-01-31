import org.apache.spark.sql.SparkSession

object GroupByKey {
  def main(arg: Array[String]) {
    val spark = SparkSession.builder()
      .master("local[1]")
      .appName("Group By Key")
      .getOrCreate()
      
    val rdd = spark.sparkContext.parallelize(Seq(("A", 1), ("B", 2), ("A", 3), ("B", 4)))
    
    val groupedRdd = rdd.groupByKey()
    groupedRdd.collect().foreach{ case (key, value) =>
      println(s"$key -> ${value.mkString(", ")}")
    }
    
    spark.stop()
  }
}