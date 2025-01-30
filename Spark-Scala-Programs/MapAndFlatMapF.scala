import org.apache.spark.sql.SparkSession

object MapAndFlatMapF {
  def main(args: Array[String]) {
    val spark = SparkSession.builder()
       .master("local[1]")
       .appName("Map and FlatMap")
       .getOrCreate()
       
       
     // Explicitly set the file path
    val filePath = "C:/wc.txt"
    
    val rdd = spark.sparkContext.textFile(filePath)
    val mapRdd = rdd.map(_.toUpperCase)
    println("Map Transformation: ")
    mapRdd.collect().foreach(println)
     
     
    val flatMapRdd = rdd.flatMap(_.split("\\s+"))
    println("FlatMap Transformation: ")
    flatMapRdd.collect().foreach(println)
     
    spark.stop()
  }
}