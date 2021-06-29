object problem_3 {
  def main(args: Array[String]): Unit = {
    val list = List(2, 5, 1, 4, 3, 7, 8, 6, 0, 9)
    counter(list)

  }
  def counter(list: List[Int]) ={
    val last_element = list.last
    val count_element = list.indexOf(last_element)+1
    println(count_element)
  }
}
