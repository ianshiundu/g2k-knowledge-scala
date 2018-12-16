
// front
val A = Array(1,2,4,3).toList // 5
// back
val B = Array(1,3,2,3).toList // 4

val Q1 = Array(1,2,2,3) // 4

val c = Array(1, 2, 2, 3)

val A2 = Array(3,2,1,6,5)
val B2 = Array(4,2,1,3,3)

val Q2 = Array(4,2,1,6,5) // 3

val c2 = Array(3,2,1,3,3)

val A3 = Array(1,2)
val B3 = Array(2,1)

def solution(A: Array[Int], B: Array[Int]): Int = {
    // write your code in Scala 2.12
  def findSmallestPositive(in: Int, l: List[Int]): Int = {
    if (l.isEmpty || l.head != in) in
    else findSmallestPositive(in + 1, l.tail)
  }
  findSmallestPositive(1, A.toList.filter(_ > 0).distinct.sorted)
}

def swap(tpl: (Int,Int)): (Int, Int) = (tpl._2, tpl._1)

//solution(Array(4,2,1,6,5), )
//solution(Array(1,2))
val s = (A ++ B).sorted
solution(Array(1,3,4,3), Array(1,2,2,3))
solution(Array(1,2), Array(2,1))
solution(Array(4,2,1,6,5), Array(3,2,1,3,3))

val l = A.zip(B)
println(l)

// filtered out front == back
//
val zipList = A2.zip(B2).filter { case (a, b) => b > a || a > b}
zipList.map { x => if (x._1 < x._2) x._1 else x._2 }.distinct.min


val lis = List(1,2,3,4)
lis.dropRight(1)


//zipList.reduceLeft((a,b) => )
//if ()

//remove if not needed
//import collection.immutable.HashSet
//
//  def flipgame(fronts: Array[Int], backs: Array[Int]): Int = {
//    val same: Set[Integer] = new HashSet[Integer]()
//    for (i <- fronts.indices if fronts(i) == backs(i))
//      same + fronts(i)
//    var ans: Int = 9999
//    for (x <- fronts if !same.contains(x)) ans = Math.min(ans, x)
//    for (x <- backs if !same.contains(x)) ans = Math.min(ans, x)
//    ans % 9999
//  }
//
//  flipgame(Array(1,2), Array(1,2))



