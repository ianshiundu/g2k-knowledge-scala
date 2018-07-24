
def solution(a: Array[Int]): Int = {
  // write your code in Scala 2.12

  def smallestPositive(num: Int, list: List[Int]): Int = {
    if (list.isEmpty || list.head != num) num
    else smallestPositive(num + 1, list.tail)
  }
  smallestPositive(1, a.toList.filter(_ > 0).distinct.sorted)
}
