package missions

object abstract_class {

  abstract class Person{
    val name:String = "human"
    val age:Int = 22
    var time:String

    def work(): Unit

    def printInfo(): Unit = {
      println(s"name=${name},age=${age}")
    }


  }

  class Teacher extends Person{

    override val name:String = "chang"

    var time:String = "123"


    def work(): Unit = {
      println("job")
    }


    override def printInfo(): Unit = {
      println(s"job=teacher,name=${name},age=${age}")
    }



  }










}
