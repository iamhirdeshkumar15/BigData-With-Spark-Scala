//Converted RDD to DataFrame using Spark APIs.

import org.apache.spark.sql.{SparkSession, Row}
import org.apache.spark.sql.types._
import scala.collection.Seq

object RddToDataFrame {
  def main(args: Array[String]) {
    val spark = SparkSession.builder()
      .master("local[1]")
      .appName("RDD to Data Frame")
      .getOrCreate()
      
    val rdd = spark.sparkContext.parallelize(Seq(("Kumar", 25), ("Shiva", 28), ("Sam", 22)))
    
    val schema = StructType(List(
        StructField("Name", StringType, nullable = true),
        StructField("Age", IntegerType, nullable = true)
        ))
        
    val rowRdd = rdd.map {case (name, age) => Row(name, age) }
    val df = spark.createDataFrame(rowRdd, schema)
    
    df.show()
    
    spark.stop()
  }
}