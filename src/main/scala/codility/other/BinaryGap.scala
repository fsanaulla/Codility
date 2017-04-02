package codility.other

import scala.annotation.tailrec

/**
  * Created by faiaz on 31.03.17.
  */
object BinaryGap {

  def solution(n: Int): Int = {

    @tailrec
    def solutionAcc(n: Int, gapSize: Int, maxGap: Int, isGap: Boolean): Int = {
      val isOne = (n & 1) != 0

      if (n == 0) maxGap
      else if (!isGap && isOne) solutionAcc(n >> 1, gapSize, maxGap, isGap = true) // start gap
      else if (isGap && !isOne) solutionAcc(n >> 1, gapSize + 1, maxGap, isGap) // moving over gap
      else if (isGap && isOne) solutionAcc(n >> 1, 0, gapSize max maxGap, isGap) // end of gap
      else solutionAcc(n >> 1, gapSize, maxGap, isGap)

    }

    solutionAcc(n, 0, 0, false)
  }

}
