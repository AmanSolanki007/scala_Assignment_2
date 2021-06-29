import org.scalatest.funsuite.AnyFunSuite
class Test_problem_8 extends AnyFunSuite {
  test("problem_8"){
    assert(problem_8.test(Array(9, 5, 8, 4, -10, 21, 6, 17, 11))===Array(21, 21, 21, 21, 21, 17, 17, 11, -1))
  }

}
