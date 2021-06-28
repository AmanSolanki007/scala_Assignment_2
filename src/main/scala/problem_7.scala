object problem_7 {
  def main(args: Array[String]): Unit = {
    val input = Array(2, 3, 1, 7, 9, 5, 11, 3, 5)
    max_difference(input)
  }
  def max_difference(arr: Array[Int]): Unit ={
    val max_element = arr.max
    val min_element = arr.min
    val max_diff = max_element - min_element
    println(s"miximum difference: $max_diff")
  }
}
