package codility.first

/**
  * Created by faiaz on 01.04.17.
  */
object RemoveChar extends App {

  def rule(str: String): Boolean = {
    if (str.contains("AA") || str.contains("BB") || str.contains("CC")) true else false
  }

  def solution(s: String): String = {
    if (s.isEmpty || !rule(s)) s
    else if (s.contains("AA")) solution(s.replace("AA", ""))
    else if (s.contains("BB")) solution(s.replace("BB", ""))
    else solution(s.replace("CC", ""))
  }

  val test = "ACCAABBC"
  val test1 = "ABCBBCBA"
  val test2 = "asda"
  val test3 = "BABABA"

  println(solution(test))
  println(solution(test1))
  println(solution(test2))
  println(solution(test3))
}
