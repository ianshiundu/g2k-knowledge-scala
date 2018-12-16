def sockMerchant(n: Int, ar: Array[Int]): Int = {
  ar.groupBy(identity).mapValues(_.length).values.map(_ / 2).sum
}

val ar = Array(1,2,1,2,1,3,2)
val mappedColors = ar.groupBy(identity).mapValues(_.length)
mappedColors.values.map(_ / 2).sum


ar.groupBy(c ⇒ c).map(group ⇒ group._2.length / 2).sum
//1 % 2