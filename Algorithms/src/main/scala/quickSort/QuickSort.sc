def quickSort(arr: Array[Int]): Array[Int] = {
//  base case, arrays with 0 or 1 element are already "sorted"
  if (arr.length < 2) arr

//  recursive case
  else {
    val pivot = arr(0)
//  sub-array of all the elements less than the pivot
    val less = arr.drop(1).filter(x => x < pivot)

    //  sub-array of all the elements greater than the pivot
    val greater = arr.drop(1).filter(x => x > pivot)
    (quickSort(less) :+ pivot) ++ quickSort(greater)
  }
}

quickSort(Array(19, 29, 12, 8))