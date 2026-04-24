package self_test

object class_this {
  def main(args: Array[String]): Unit = {

    val s1 = new Student("ddd", 22)

    println(s1.name)

    val w1 = new Worker("da", 33)

    println(w1.name)

  }



}
class Student(var name:String,var age:Int)



class Worker{
  var name:String=_
  var age:Int = _

  def this(name:String,age:Int){
    this()
    this.name = name
    this.age = age
  }


}
