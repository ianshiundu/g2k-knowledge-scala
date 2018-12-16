val rows = 2
val cols = 3

val array = Array.ofDim[String](rows, cols)

array(0)(0) = "a"
array(0)(1) = "b"
array(0)(2) = "c"
array(1)(0) = "d"
array(1)(1) = "e"
array(1)(2) = "f"

val x = array(1)(0)