package codility.other

/**
  * Created by faiaz on 31.03.17.
  */
object OddOccurrencesInArray extends App {
  def solution(a: Array[Int]): Int = {
    a.fold(0)(_ ^ _)
  }
}
