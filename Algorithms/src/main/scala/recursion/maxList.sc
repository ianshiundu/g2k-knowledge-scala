def maxList(xs: List[Int]): Int = {
  def maxAccum(xs: List[Int], maxNum: Int): Int = {
    if (xs.isEmpty) maxNum
    else {
      val newMax = if (xs.head > maxNum) xs.head else maxNum
      maxAccum(xs.tail, newMax)
    }
  }
  maxAccum(xs, 0)
}

val xs = List.range(1, 5)

maxList(xs)