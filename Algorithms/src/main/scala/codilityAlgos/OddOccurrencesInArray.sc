val odd = Array(9, 3, 9, 3, 9, 7, 9)

def solution(a: Array[Int]): Int = {
  // write your code in Scala 2.12
  val list = a.toList
  val pair = list.groupBy(identity).mapValues(_.size)

  if (pair.head._2 % 2 == 1) pair.head._1
  else 0
}
val l = odd.toList
val pair = l.groupBy(identity).mapValues(_.size)

solution(odd)



println(pair.values.toList)

println(4 % 2)