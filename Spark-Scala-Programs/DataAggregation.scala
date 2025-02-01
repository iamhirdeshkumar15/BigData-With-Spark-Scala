//Implemented aggregation functions like sum, avg, and count

import org.apache.spark.sql.SparkSession

object DataAggregation {
  def main(args: Array[String]) {
    val spark = SparkSession.builder()
      .master("local[1]")
      .appName("Data Aggregation")
      .getOrCreate()
      
    import spark.implicits._
    
    val df = Seq(
        ("Kumar", 25), 
        ("Sam", 22),
        ("Pratik", 19),
        ("Shiva", 28)
    ).toDF("Name", "Age")
    
   df.groupBy().agg(
       org.apache.spark.sql.functions.avg($"Age").as("Average Age"),
       org.apache.spark.sql.functions.sum($"Age").as("Total Age"),
       org.apache.spark.sql.functions.count($"Age").as("Count")
   ).show()
   
   
   spark.stop()
        
        
        
  }
}