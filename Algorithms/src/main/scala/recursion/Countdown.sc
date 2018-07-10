def countdown(n: Int): Int = {
  println(n)
// base case
  if (n <= 0) n
// recursive case
  else countdown(n - 1)
}

countdown(10)