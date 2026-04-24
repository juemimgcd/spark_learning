package missions

object hotel_rooms {
  def main(args: Array[String]): Unit = {

    var rooms_status = new Array[Boolean](100)
    for(i <- rooms_status.indices){
      rooms_status(i) = false
    }

    for(human_no <- 1 to 100){
      for(room_no<-rooms_status.indices){
        if(room_no+1 % human_no == 0){
          rooms_status(room_no) = !rooms_status(room_no)
        }
      }
    }

    for(i<-rooms_status.indices){
      if(rooms_status(i)){
        println(i+1)
      }


    }









  }

}
