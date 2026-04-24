package com.spark.core.greenHand

import org.apache.spark.{SparkConf, SparkContext}

object rdd_join {
  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setMaster("local").setAppName("File")

    val sc = new SparkContext(conf)

    val rdd1 = sc.parallelize(List("zs"->70,"ls"->80,"ww"->75))
    val rdd2 = sc.parallelize(List("ll" -> 85, "ww" -> 90, "zs" -> 85))


    rdd1.join(rdd2).map(data=>(data._1,data._2._1 + data._2._2)).foreach(println)











  }

}
