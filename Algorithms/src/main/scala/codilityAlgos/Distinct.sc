def solution(a: Array[Int]): Int = {
  // write your code in Scala 2.12
  a.toList.distinct.length
}

val xs = List(2,1,1,2,3,1)
val xs2 = Array(-1000, -999, -1, -1222)
xs.count(_==1)
solution(xs.toArray)
