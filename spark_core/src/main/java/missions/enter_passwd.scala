package missions

import scala.io.StdIn
import scala.util.control.Breaks.break
object enter_passwd {

  def main(args: Array[String]): Unit = {
    var name = "cheng"
    var passwd = "123456"

    var count = 3

    while (count>0){
      count = count -1
      var in_name = StdIn.readLine()
      var in_passwd = StdIn.readLine()

      if(in_name == name && in_passwd == passwd){
        println("登录成功")
        break()

      }
      else {
        println(f"你还有${count}次机会")
      }

    }

  }


}
