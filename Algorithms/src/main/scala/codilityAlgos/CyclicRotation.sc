def solution(a: Array[Int], k: Int): Array[Int] = {
  def order(l: List[Int], k: Int): List[Int] = {
    def rotate(l: List[Int]): List[Int] = {
      l.last :: l.dropRight(1)
    }
    if (k == 0) l
    else order(rotate(l), k - 1)
  }
  if (a.isEmpty) a
  else
  order(a.toList, k).toArray
}


val xs = List(1,2,3,4)

println(xs.count(_.isInstanceOf[Int]))

println(xs.dropRight(1))

//xs.drop(xs.count(_.isInstanceOf[Int])) foreach println

solution(Array(3, 8, 9, 7, 6), 3)
solution(Array(0,0,0), 1)
solution(xs.toArray, 4)