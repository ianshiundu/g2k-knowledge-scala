def factorial(num: Int): Int = {
//  base case
  if (num.equals(1)) 1
//    recursive case
  else num * factorial(num - 1)
}

factorial(5)