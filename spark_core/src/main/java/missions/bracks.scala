package missions

object bracks {
  def main(args: Array[String]): Unit = {

    def factor(n:Int):Int= {
      if(n == 1){
        1
      }
      else if(n == 2){
        2
      }
      else{
        factor(n-1) + factor(n-2)
      }

    }

    var result = factor(5)

    println(result)


  }




}
