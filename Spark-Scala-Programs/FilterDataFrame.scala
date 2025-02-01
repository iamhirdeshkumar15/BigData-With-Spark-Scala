//Added filtering example for rows in a DataFrame.

import org.apache.spark.sql.SparkSession

object FilterDataFrame {
  def main(args: Array[String]) {
    val spark = SparkSession.builder()
      .master("local[1]")
      .appName("Filter Data Frame")
      .getOrCreate()
    
      
    import spark.implicits._
    
    val df = Seq(
        ("Kumar", 25), ("Sam", 22), ("Shiva", 28)
        ).toDF("Name", "Age")
        
    val filteredDf = df.filter($"Age" < 26)
    filteredDf.show()
    
    spark.stop()

  }
}