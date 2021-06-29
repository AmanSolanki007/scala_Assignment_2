import org.scalatest.funsuite.AnyFunSuite
class Test_problem_4 extends AnyFunSuite {
  test("problem_4"){
    assert(problem_4.absolute(List (2, -4, 3, -1, 23, -4, -54))===List(2,4,3,1,23,4,54))
  }

}
