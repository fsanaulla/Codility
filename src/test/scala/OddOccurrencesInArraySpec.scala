import org.scalatest.FlatSpec

import codility.OddOccurrencesInArray.solution
/**
  * Created by faiaz on 31.03.17.
  */
class OddOccurrencesInArraySpec extends FlatSpec {
  "OddOccurrencesInArray" should "return 7 on Array(9, 3, 9, 3, 9, 7, 9)" in {

    val testArray = Array(9, 3, 9, 3, 9, 7, 9)
    solution(testArray) == 7
  }
}
