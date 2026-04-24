package self_test

import org.apache.spark.sql.SparkSession

object from_csv_sql_spark {
  def main(args: Array[String]): Unit = {
    val spark = new SparkSession.Builder()
      .master("local")
      .appName("test")
      .getOrCreate()
    import spark.implicits


    val rdd = spark.read.csv("datas/scores.csv")

    val df = rdd.toDF("name","course","score")

    df.createTempView("scores")

    spark.sql("select name from scores").show()




















  }

}
