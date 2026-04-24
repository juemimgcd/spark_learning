package com.spark.core.greenHand

import org.apache.spark.{SparkContext,SparkConf}

object rdd_learning {
  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setMaster("local").setAppName("RDD")

    val sc = new SparkContext(conf)


    val arr = Array(1, 2, 3, 4, 5)

    val rdd = sc.parallelize(arr)

    rdd.collect().foreach(println)



    sc.stop()








  }

}
