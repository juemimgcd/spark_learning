package self_test

object array {
  def main(args: Array[String]): Unit = {

    var arr = Array(1,2,3,4,5)

    var (left,right) = arr.partition(_>3)

    println(left.toList)



  }

}
