import org.apache.spark.sql.SparkSession

object FilterLines {
  def main(args: Array[String]) {
    val spark = SparkSession.builder()
      .master("local[1]")
      .appName("Filter Lines")
      .getOrCreate()
      
    val filepath = "C:/wc1.txt"
    val keyword = "&"
    val rdd = spark.sparkContext.textFile(filepath)
    
    val filteredLines = rdd.filter(_.contains(keyword))
    filteredLines.collect().foreach(println)
    
    spark.stop()
  }
}