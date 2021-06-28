object problem_1 {
  def main(args: Array[String]): Unit = {
    val list =List(1,2,3,4)
    reapeter(3,list)
  }
  def reapeter (num:Int,arr:List[Int]) = {

    val result = arr.flatMap(List.fill(num)(_))
    for (x<- result)
      println(x)
  }

}
