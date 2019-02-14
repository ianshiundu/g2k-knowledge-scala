def jumpingOnClouds(c: Array[Int]): Int = {
  var steps = 0
  var index = 0
  while (index < c.length - 1) {
    if((index + 2 < c.length) && c(index + 2) != 1) {
      index = index + 2
    } else {
      index = index + 1
    }
    steps += 1
  }

  steps
}

val c = Array(0, 0, 1, 0, 0, 1, 0)

jumpingOnClouds(c)
