package com.spark.core.final_test

import org.apache.spark.sql.SparkSession
import org.apache.spark.streaming.{Seconds, StreamingContext}
import org.apache.spark.{SparkConf, SparkContext}

object funComparedWithSQL {

  //task: work out the avg(score) of all students
  def main(args: Array[String]): Unit = {
//    val conf = new SparkConf().setMaster("local[*]").setAppName("avg")
//
//    val sc = new SparkContext(conf)
//
//    val rdd = sc.textFile("datas/scores.csv")
//
//    rdd.map(line=>{
//      val arr = line.split(",")
//      (arr(0),arr(2).toDouble)
//    }).aggregateByKey((0.0,0))(
//      (t,v)=>(t._1+v,t._2+1),
//      (t1,t2)=>(t1._1+t2._1,t1._2+t2._2)
//    ).mapValues{
//      case (sum,cnt)=> sum / cnt
//    }.foreach(println)

//    val spark = new SparkSession.Builder().master("local[*]").appName("test").getOrCreate()
//    import spark.implicits
//
//    val sc = spark.read.csv("datas/scores.csv")

//    val df = sc.toDF("name","course","score")
//
//    df.createTempView("scores")
//
//    val result = spark.sql("select name,avg(score) from scores group by name")
//
//    result.show()

    val conf = new SparkConf().setMaster("local[*]").setAppName("test")

    val sc = new StreamingContext(conf = conf,Seconds(5))

    val rdd = sc.textFileStream("datas/scores.csv")

    rdd.map(line=>{
      val arr = line.split(",")
      (arr(0),arr(2))
    }).reduceByKey(_+_).print()


    sc.start()
    sc.awaitTermination()

































  }



















}
