// SparkSession is a unified entry point for Spark
// Import SparkSession
import org.apache.spark.sql.SparkSession

object WordCount {
  def main(args: Array[String])
  {
    // Create a SparkSession
    val spark = SparkSession.builder()
      .master("local[1]") // Adjust as needed for your cluster
      .appName("Word Count from File")
      .getOrCreate()

    // Explicitly set the file path
    val filePath = "C:/wc.txt"

    // Read the text file into an RDD
    val rdd = spark.sparkContext.textFile(filePath)

    // Perform word count
    val wordCounts = rdd
      .flatMap(_.split("\\s+")) // Split each line into words
      .map(word => word.replaceAll("[^a-zA-Z]", "").toLowerCase) // Clean and normalize words
      .filter(_.nonEmpty) // Remove empty strings
      .map(word => (word, 1)) // Map each word to (word, 1)
      .reduceByKey(_ + _) // Reduce by key to get word counts

    // Collect and print the results
    wordCounts.collect().foreach { case (word, count) =>
      println(s"$word: $count")
    }

    // Stop the SparkSession
    spark.stop()
  }
}
