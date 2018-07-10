/*
Different ways to calculate the sum of a list using
recursive Scala methods
*/

val list = List.range(1, 100)
val largeList = List.range(1, 1000)
println(sum(list))
println(sum2(largeList))

// yields a "java.lang.StackOverflowError" with large lists
def sum(ints: List[Int]): Int = ints match {
  case Nil => 0
  case x :: tail => x + sum(tail)
}

// tail-recursive solution
def sum2(ints: List[Int]): Int = {
  def sumAccumulator(ints: List[Int], acc: Int): Int = {
    ints match {
      case Nil => acc
      case x :: tail => sumAccumulator(tail, x + acc)
    }
  }
  sumAccumulator(ints, 0)
}

// stackoverflow.com/questions/12496959/summing-values-in-a-list
// this example is from that page:
def sum3(xs: List[Int]): Int = {
  if (xs.isEmpty) 0
  else xs.head + sum3(xs.tail)
}

def sumWithReduce(ints: List[Int]): Int = {
  ints.reduceLeft(_ + _)
//  instead of reduceLeft we can just say
//  ints.sum
}