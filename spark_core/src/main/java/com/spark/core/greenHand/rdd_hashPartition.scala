package com.spark.core.greenHand

import org.apache.spark.{HashPartitioner, SparkConf, SparkContext}

object rdd_hashPartition {
  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setMaster("local").setAppName("File")

    val sc = new SparkContext(conf)

    val arr = List(12, 3, 4, 5, 6)
    val rdd = sc.parallelize(arr)

    rdd.map(data=>(data,1)).partitionBy(new HashPartitioner(2)).saveAsTextFile("E:/datas2")

    sc.stop()









  }


}
