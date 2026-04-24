package self_test

object arr {

  def main(args: Array[String]): Unit = {

    var list = List(List(1,2,3),3,List(3,4,5))

    val new_list = list.flatMap(data => {
      data match {
        case list: List[Int] => list
        case _ => List(data)
      }
    })


    new_list.foreach(println)




  }

}
