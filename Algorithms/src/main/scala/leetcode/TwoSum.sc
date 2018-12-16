//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.

def twoSum(nums: Array[Int], target: Int): Array[Int] =
  nums.zipWithIndex.
    filter(x =>
      (nums.take(nums.indexOf(x._1)) ++ nums.drop(nums.indexOf(x._1)+1))
        .contains(target - x._1)).map(_._2)
//
//val x = List(2, 7, 11, 15)
//x.combinations(2).find(_.sum == 9).get.map(x.indexOf)
//
twoSum(Array(3,3), 6)
