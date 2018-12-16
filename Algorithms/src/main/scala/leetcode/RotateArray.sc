//Problem: Rotate an array of n elements to the right by k steps. For example, with n = 7 and k = 3,
////the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].

val arr = Array(1,2,3,4,5,6,7)
val arr2 = Array(-1,-100,3,99)
val arr3 = Array (1,2,3,4,5)
val steps = 3
arr.toList.splitAt(3)

arr2.toList.splitAt(steps+1) match {
  case (a, b) ⇒ List.concat(b,a)
}
//println(arr.sliding(2, 3).toList)
//val nums = (1 to 5).toArray
//nums.sliding(2,2).toList
//def rotate(nums: Array[Int], k: Int): Array[Int] = {
//  if (nums.isEmpty || k < 0) nums
//  else {
//    nums.toList.map(x ⇒ (x , x + k)) match {
//      case (a, b) ⇒ List.concat(b,a).toArray
//    }
//  }
//}

//val arr2 = Array(-1,-100,3,99)
//val arr3 = Array (1,2,3,4,5)
arr2.toList.splitAt(2)
arr3.toList.map(x ⇒ (x, x + 2))

//rotate(Array(-1,-100,3,99), 3)

def get[A](list: List[A], index: Int): A = {
  list.tail.foldLeft((list.head, 0)) {
    (res, curr) ⇒ if (res._2 == index) res else (curr, res._2 + 1)
  } match {
    case (result, idx) if index == idx ⇒ result
    case _ ⇒ throw  new Exception("Bad index")
  }
}

def reverse[A](list: List[A]): List[A] = {
  list.foldLeft(List[A]()) { (res, cur) ⇒ cur :: res }
}

get(arr.toList, 3)