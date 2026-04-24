package self_test

object func_2 {
  def main(args: Array[String]): Unit = {


    class Student(name:String,age:Int) {
      var std_no: String = _

      def this(name: String, age: Int, std_no: String) {
        this(name, age)
        this.std_no = std_no
      }
    }
    class Student2(var name:String,var age:Int,var std_no:String){

    }

//
//      override def toString: String =f"name =${name},age=${age} "
//
//      def printInfo(): Unit = {
//        println("**********************")
//      }


    var s1 = new Student("jing",23,"2333")

    var s2 = new Student2("ddd", 22, "2222")

    println(s2.std_no)


//
//    println(s1.toString)
//
//    println(s1.printInfo())

  }


}
