package codility.first

/**
  * Created by faiaz on 01.04.17.
  */
object ZuzanaPhone extends App {

  def numberLength(num: Int): Int = {
    num.toString.length
  }

  def solution(a: Array[Int]): Int = {
    if (a.length < 2) a.head
    else {
      val headLength = numberLength(a.min)
      a.sorted
        .takeWhile(num => numberLength(num) <= headLength)
        .map(n => n -> n.toString.map(_.asDigit).toSet)
        .minBy(_._2.size)._1
    }
  }

  println(solution(Array(123, 222, 12, 22, 99)))
}
