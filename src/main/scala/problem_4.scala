object problem_4 {
  def main(args: Array[String]): Unit = {
  val list = List (2, -4, 3, -1, 23, -4, -54)
    val result=absolute(list)
    for (i<-result) println(i)
  }
  def absolute(list: List[Int]): List[Int] ={
    list.map(_.abs)
  }
}
