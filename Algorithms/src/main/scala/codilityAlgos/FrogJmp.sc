def solution(x: Int, y: Int, d: Int): Int = {
  // write your code in Scala 2.12
  val distance: Long = y - x
  val minimum = distance / d

  if (distance % d > 0) (minimum + 1).toInt
  else minimum.toInt
}

solution(10, 85, 30)

solution(5, 10, 5)

def solution2(x: Int, y: Int, d: Int): Int = {
  if (x <= y) {
    val distanceBetweenXY = y - x
    if (distanceBetweenXY % d == 0) distanceBetweenXY/d
    else (distanceBetweenXY/d) + 1

  } else {
    throw new Exception("X can not be Greater than Y!")
  }
}