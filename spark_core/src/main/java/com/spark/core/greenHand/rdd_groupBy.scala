package com.spark.core.greenHand

import org.apache.spark.{SparkConf, SparkContext}

object rdd_groupBy {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setMaster("local").setAppName("File")

    val sc = new SparkContext(conf)

    val rdd = sc.parallelize(Array(1, 2, 3, 4, 5, 6, 7))

//    rdd.groupBy(data=>data % 2).foreach(println)



    var rdd2 = sc.parallelize(Array("hello word","hello spark","hello spark"))


//    rdd2.flatMap(data => data.split(" ")).map(data => (data, 1)).groupByKey().map(data => {
//      (data._1, data._2.sum)
//    }).collect().foreach(println)

    rdd2.flatMap(data => data.split(" ")).map(data => (data, 1)).groupByKey().collect().foreach(println)






  }

}
