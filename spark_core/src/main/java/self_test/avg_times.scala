package self_test

import org.apache.spark.{SparkConf, SparkContext}

object avg_times {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setMaster("local").setAppName("RDD")

    val sc = new SparkContext(conf)

    val rdd = sc.textFile("datas/apears.txt")

    rdd.map(line=>{
      val strings = line.split(":")
      val word = strings(0)
      val score = strings(1).toInt
      (word,score)
    }).aggregateByKey((0,0))(
      (tuple,value)=>(tuple._1 + value,tuple._2+1),
      (t1,t2)=>(t1._1+t2._1,t1._2+t2._2)
    ).mapValues{case (scores,counts)=>scores.toDouble / counts}.collect().foreach(println)











  }

}
