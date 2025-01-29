import org.apache.spark.sql.SparkSession

object SetOperations {
  def main(args: Array[String]) {
    val spark = SparkSession.builder()
      .master("local[1]")
      .appName("Set Operations")
      .getOrCreate()

    val rdd1 = spark.sparkContext.parallelize(Seq(1, 2, 3, 4))
    val rdd2 = spark.sparkContext.parallelize(Seq(3, 4, 5, 6))

    val unionRdd = rdd1.union(rdd2)
    val intersectionRdd = rdd1.intersection(rdd2)
    val subtractRdd = rdd1.subtract(rdd2)

    println("Union: ")
    unionRdd.collect().foreach(println)

    println("Intersection: ")
    intersectionRdd.collect().foreach(println)

    println("Subtraction: ")
    subtractRdd.collect().foreach(println)

    spark.stop()
  }
}
