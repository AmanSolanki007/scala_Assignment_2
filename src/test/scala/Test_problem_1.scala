import org.scalatest.funsuite.AnyFunSuite
class Test_problem_1 extends AnyFunSuite {
  test("problem_1"){
    assert(problem_1.reapeter(2,List(1,2,3,4))===List(1,1,2,2,3,3,4,4))
  }
}
