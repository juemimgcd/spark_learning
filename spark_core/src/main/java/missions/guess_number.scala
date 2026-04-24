package missions

import scala.io.StdIn
import scala.util.Random

object guess_number {
  def main(args: Array[String]): Unit = {

    var flag_number = Random.nextInt(100)
    var guess_count = 0

    while(true){
      println("enter a number")
      var input_number = StdIn.readInt()

      if(input_number > flag_number){
        println("bigger")
        guess_count+=1
      }
      else if(input_number < flag_number){
        println("smaller")
        guess_count+=1

      }
      else {
        guess_count+=1
        println(s"success and you have used ${guess_count} times to get the ture answer")
        return
      }


    }












  }

}
