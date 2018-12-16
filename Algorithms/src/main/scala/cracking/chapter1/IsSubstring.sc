def isSubstring(s1: String, s2: String): Boolean = {
  if (s1.reverse == s2) true
  else false
}

isSubstring("ian", "nai")