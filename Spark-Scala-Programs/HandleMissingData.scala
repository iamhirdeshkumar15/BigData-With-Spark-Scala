//Added missing data handling with imputation and removal.

import org.apache.spark.sql.SparkSession

object HandleMissingData {
  def main(args: Array[String]) {
    val spark = SparkSession.builder()
      .master("local[1]")
      .appName("Handle Missing Data")
      .getOrCreate()
      
    import spark.implicits._
    
    val data = Seq(
        ("Kumar", Some(25)),
        ("Sam", None),
        ("Pratik", Some(19))
    ).toDF("Name", "Age")
    
    //fill missing values
    val filledDf = data.na.fill(Map("Age" -> 0))
    println("Data with Missing Values Filled: ")
    filledDf.show()
    
    // Drop rows with missing values
    val droppedDf = data.na.drop()
    println("Data with Missing Values Dropped: ")
    droppedDf.show()
    
    spark.stop()
  }
}