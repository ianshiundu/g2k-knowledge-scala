def solution(n: Int): Int = {
  val list = "(?<=1)0+(?=1)".r.findAllIn(n.toBinaryString).toList

  if (list.isEmpty) 0
  else list.maxBy(_.length).length
}

solution(1041)