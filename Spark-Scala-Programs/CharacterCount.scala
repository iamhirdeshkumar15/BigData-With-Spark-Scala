import org.apache.spark.sql.SparkSession

object CharacterCount {
  def main(args: Array[String]){
    val spark = SparkSession.builder()
      .master("local[1]")
      .appName("Character Count")
      .getOrCreate()
    
    val filepath = "C:/wc.txt"
    val rdd = spark.sparkContext.textFile(filepath)
    
    var charCount = rdd.map(_.length).reduce(_+_)
    println(s"Total number of characters: $charCount")
    
    spark.stop()
    
  }
}