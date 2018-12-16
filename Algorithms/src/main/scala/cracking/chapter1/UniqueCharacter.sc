/**
  *
  * @param str
  * @return
  * Implement an algorithm to determine if a string has all unique characters.
  * What if you can not use additional data structures?
  */


def isUnique(str: String): Boolean = str == str.distinct

isUnique("cracking") //res0: Boolean = false
isUnique("Ian")
