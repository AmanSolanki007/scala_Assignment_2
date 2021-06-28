object problem_2 {
  def main(args: Array[String]): Unit = {
    remove_odd_position(list = List (2, 5, 3, 4, 6, 7, 8, 9) )
  }
  def remove_odd_position(list: List[Int])={
    for (num <- list)
      if (list.indexOf(num)%2==1)
        println(num)
  }
}
