def solution(a: Array[Int]): Int = {
  // write your code in Scala 2.12
  def findMissingElem(i: Int, xs: List[Int]): Int ={
    val list = xs.distinct.sorted
    if (list.isEmpty || list.head != i + 1) i + 1
    else findMissingElem(i + 1, list.tail)
  }
  if (a.length.equals(0)) 1
  else findMissingElem(0, a.toList)
}

val a = Array(2,3,1,5)
solution(a)