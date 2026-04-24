package missions

object apple_destribution {
  def main(args: Array[String]): Unit = {
    // 把n个苹果分到m个盘子里面的方法数

    def factor_apple(n:Int,m:Int): Int = {
      if(m == 1 || n == 0){
        1
      }
      else if(m > n) {
        factor_apple(n, n)
      }
      else {
        factor_apple(n-m,m) + factor_apple(n,m-1)
      }



    }

    println(factor_apple(7, 3))





  }

}
