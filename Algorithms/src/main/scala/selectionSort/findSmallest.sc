// first we find the smallest value in the array
def findSmallest(array: Array[Int]): Int = {

  var smallest = array(0)

  for (i <- 1 until array.length){
    if (array(i) < smallest) {
      smallest = array(i)
    }
  }
  smallest
}

// then, sort array
def selectionSort(array: Array[Int]): Array[Int] = {
  val newArray = new Array[Int](array.length)

  for (i <- array.indices){
//    Find the smallest element in the array and add it to the new array
    val smallest = findSmallest(array)

    newArray(i) = smallest
//    set current smallest value in array to avoid reusing values
    array(array.indexOf(smallest)) = array.max + 1
  }
  newArray
}

selectionSort(Array(5, 2, 6, 8, 3, 1))