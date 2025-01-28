import org.apache.spark.sql.SparkSession

object LineCount {
 def main(args: Array[String]) {
   val spark = SparkSession.builder()
               .master("local[1]")
               .appName("Line COunt")
               .getOrCreate()
          
   val filepath = "C:/wc.txt"
   val rdd = spark.sparkContext.textFile(filepath)
   
   val linecount = rdd.count()
   println(s"Total number of lines: $linecount")
   
   spark.stop()
   
 }
}