package self_test

import java.io.PrintWriter
import scala.io.Source

object file_in_out {
  def main(args: Array[String]): Unit = {

    var file = Source.fromFile("E:\\java_play\\spark_scala\\spark_core\\src\\main\\java\\missions\\name.txt")
    var lines = file.getLines()

    //lines.foreach(println)

    var writer = new PrintWriter("E:\\java_play\\spark_scala\\spark_core\\src\\main\\java\\missions\\name2.txt")

    lines.foreach(writer.println)

    writer.close()
  }




}
