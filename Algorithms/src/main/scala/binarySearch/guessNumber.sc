import guessNumber.binarySearch

object guessNumber {
  def binarySearch(list: List[Int], item: Int): Int = {
    if (list.isEmpty) Nil

    val guessIndex = list.length / 2
    val guess = list(guessIndex)

    if (item == guess) guess
    else if (item < guess) {
      val halfList = list.take(list.length / 2)
      binarySearch(halfList, item)
    }
    else {
      val halfList = list.drop(1 + (list.length / 2))
      binarySearch(halfList, item)
    }
  }
}

val someList = List(1, 3, 5, 7, 9)
println(binarySearch(someList, 3))

// Notes:
/*
Binary search run in logarithmic time
i.e if a list contains 8 numbers it will take 3 steps
Log 8 = 3
thus O(log n)
*/