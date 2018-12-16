def solution(a: Array[Int]): Int = {
  // write your code in Scala 2.12
  def isPermutation(list: List[Int]): Int = {
    if (list.tail.isEmpty) 1
    else if (list.tail.head != list.head + 1) 0
    else isPermutation(list.tail)
  }

  val l = a.toList.sorted
  if (l.head != 1) 0
  else if (l.last != l.size) 0
  else isPermutation(l)
}

val a = Array(4, 1, 3, 2)
a.toList.sorted.size
solution(a)