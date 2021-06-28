object problem_6 {
  def main(args: Array[String]): Unit = {
    val input = Array (2, 3, 5, 7, -7, 5, 8, -5)
    maximun_product(input)
  }
  def maximun_product(arr: Array[Int]): Unit = {
    var Max = Integer.MIN_VALUE
    var m_i = -1
    var m_j = -1
    for (i <- 0 until arr.length - 1)
    {
      for (j <- i+1 until arr.length - 1)
      {
        if (Max < arr(i) * arr(j))
        {
          Max = arr(i) * arr(j)
          m_i=i
          m_j=j
        }
      }
    }
    println (arr(m_i)*arr(m_j))

  }

}

