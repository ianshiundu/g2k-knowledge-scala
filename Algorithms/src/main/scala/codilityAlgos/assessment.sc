
// front
val A = Array(1,2,4,3).toList
// back
val B = Array(1,3,2,3).toList

def solution(A: Array[Int], B: Array[Int]): Int = {
    // write your code in Scala 2.12
  def findSmallestPositive(in: Int, l: List[Int]): Int = {
    if (l.isEmpty || l.head != in) in
    else findSmallestPositive(in + 1, l.tail)
  }
  findSmallestPositive(1, A.toList.filter(_ > 0).distinct.sorted)
}

//solution(Array(4,2,1,6,5), )
//solution(Array(1,2))
val s = (A ++ B).min
solution(Array(1,3,4,3), Array(1,2,2,3))
solution(Array(2,1), Array(2,1))
solution(Array(4,2,1,6,5), Array(3,2,1,3,3))

val l = A.zip(B).toMap
println(l)

//if ()


