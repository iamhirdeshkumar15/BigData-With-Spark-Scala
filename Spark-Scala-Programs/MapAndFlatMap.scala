import org.apache.spark.sql.SparkSession

object MapAndFlatMap {
  def main(args: Array[String]) {
    val spark = SparkSession.builder()
       .master("local[1]")
       .appName("Map and FlatMap")
       .getOrCreate()
       
     val rdd = spark.sparkContext.parallelize(Seq("hello world", "Welcome to Spark"))
     val mapRdd = rdd.map(_.toUpperCase)
     println("Map Transformation: ")
     mapRdd.collect().foreach(println)
     
     
     val flatMapRdd = rdd.flatMap(_.split("\\s+"))
     println("FlatMap Transformation: ")
     flatMapRdd.collect().foreach(println)
     
     spark.stop()
  }
}