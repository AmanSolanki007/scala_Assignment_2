object problem_4 {
  def main(args: Array[String]): Unit = {
  val list = List (2, -4, 3, -1, 23, -4, -54)
    absolute(list)
  }
  def absolute(list: List[Int]): Unit ={
    for (num<-list)
      println(num.abs)
  }

}
