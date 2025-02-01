//Added SQL queries on structured DataFrames.

import org.apache.spark.sql.SparkSession

object SqlQueries {
  def main(args: Array[String]) {
    val spark = SparkSession.builder()
      .master("local[1]")
      .appName("Sql Queries")
      .getOrCreate()
      
    import spark.implicits._
    
    val data = Seq(("Kumar", 25),
        ("Sam", 22),
        ("Shiva", 28))
    
    val df = data.toDF("Name", "Age")
    df.createOrReplaceTempView("People")
    
    val result = spark.sql("SELECT * FROM People WHERE Age < 26")
    result.show()
    
    spark.stop()
  }
}
