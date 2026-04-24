package self_test

object func {
  def main(args: Array[String]): Unit = {

//    var result = (a:Int,b:Int) => a+b
//
//    println(result(2,1))
//
//
//    def action_to_number(a: Int, b: Int, op: (Int,Int) => Int): Int = {
//       op(a, b)
//    }
//
//    println(action_to_number(1, 2, _ + _))
//
//    println(action_to_number(4, 3, (a, b) => a + b))
//
//
//
    var arr = Array(1,2,3,4,5,6)

    println(arr.last)


    var new_arr = arr.map(_*2)

    for(i<-new_arr){
      println(i)
    }

  }

  def curring(a: Int)(b: Int): Int = {
    a + b
  }



  def print_hello():Unit={
    println("hello")
  }
  print_hello()

  def sum_numbers():Int = {
    var a = 1
    var b = 2
    a+b
  }

  println(sum_numbers())



}
