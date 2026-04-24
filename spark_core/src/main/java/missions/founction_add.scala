package missions

object founction_add {
  def main(args: Array[String]): Unit = {

    def action(x:Int,y:Int,op:(Int,Int)=>Int) = {
      op(x,y)
    }

    var result = action(1,2,(_+_))
    println(result)


  }

}
