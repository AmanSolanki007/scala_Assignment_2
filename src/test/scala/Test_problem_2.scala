import org.scalatest.funsuite.AnyFunSuite
class Test_problem_2 extends AnyFunSuite {
  test("problem_2"){
    assert(problem_2.remove_odd_position(List (2, 5, 3, 4, 6, 7, 8, 9))===(5,4,7,9))
  }
}
