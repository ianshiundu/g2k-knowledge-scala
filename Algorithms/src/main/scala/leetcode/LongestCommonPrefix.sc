def longestCommonPrefix(strs: Array[String]): String = {
  val xs =
    strs.toList

  xs.foldLeft("")((_,_) ⇒
    (xs.min.view, xs.max.view).zipped.takeWhile(v ⇒ v._1 == v._2).unzip._1.mkString)
}

val pref = Array("flower", "flow", "flight")
longestCommonPrefix(pref)