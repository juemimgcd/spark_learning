package self_test

import scala.collection.immutable

class map_desgin {
  def main(args: Array[String]): Unit = {

    var student_id_name_score_map: Map[String, Map[String,List[Int]]] = Map()

    var student1 = Map("zahnsgan" -> List(55,44,66))
    var id1 = "1001"

    student_id_name_score_map+=(id1->student1)










  }

}
