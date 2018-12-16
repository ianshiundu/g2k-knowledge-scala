def reverse(x: Int): Int = {

  val isNegative = if (x < 0) true else false

  val reverse = if(isNegative) (x.toLong*(-1)).toString.reverse
  else x.toString.reverse

  if (reverse.toLong > Int.MaxValue || reverse.toLong < Int.MinValue) 0
  else {
    if (isNegative) reverse.toInt * (-1) else reverse.toInt
  }

}
