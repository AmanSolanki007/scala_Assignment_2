object problem_1 {
  def main(args: Array[String]): Unit = {
    val list =List(1,2,3,4)
    val result = reapeter(3,list)
    for (i<-result)
      println(i)
  }
  def reapeter (num:Int,arr:List[Int]):List[Int]= {

     arr.flatMap(List.fill(num)(_))

  }

}
