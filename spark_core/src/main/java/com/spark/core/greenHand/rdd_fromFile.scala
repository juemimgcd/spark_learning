package com.spark.core.greenHand

import org.apache.spark.{SparkConf, SparkContext}

object rdd_fromFile {
  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setMaster("local").setAppName("File")

    val sc = new SparkContext(conf)

    var rdd = sc.textFile("datas/rdd_file.txt")

    rdd.collect().foreach(println(_))










  }

}
