/**
  * Write a method to decide if two strings are anagrams or not.
  */

def isPermutation(str1: String, str2: String): Boolean =
  str1.sorted == str2.sorted

isPermutation("Ian", "naI")