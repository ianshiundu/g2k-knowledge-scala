def solution(a: Array[Int]): Int = {
  // write your code in Scala 2.12
  def findMissing(i: Int, list: List[Int]): Int ={
    if (list.isEmpty || list.head != i + 1) i + 1
    else findMissing(i + 1, list.tail)
  }
  if (a.length.equals(0)) 1
  else findMissing(0, a.toList.sorted)
}

val a = Array(2,3,1,5)
solution(a)