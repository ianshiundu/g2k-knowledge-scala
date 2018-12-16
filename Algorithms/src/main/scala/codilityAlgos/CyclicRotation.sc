/*
A zero-indexed array A consisting of N integers is given. Rotation of the array means that each element is shifted right by one index, and the last element of the array is also moved to the first place.

For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7]. The goal is to rotate array A K times; that is, each element of A will be shifted to the right by K indexes.

Write a function:

object Solution { def solution(A: Array[Int], K: Int): Array[Int] }

that, given a zero-indexed array A consisting of N integers and an integer K, returns the array A rotated K times.

For example, given array A = [3, 8, 9, 7, 6] and K = 3, the function should return [9, 7, 6, 3, 8].

Assume that:

N and K are integers within the range [0..100];
each element of array A is an integer within the range [−1,000..1,000].
In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.
 */


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