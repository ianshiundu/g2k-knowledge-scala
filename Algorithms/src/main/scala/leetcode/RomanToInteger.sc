def romanToInt(s: String): Int = {
  val numerals = Map('I' -> 1, 'V' -> 5, 'X' -> 10, 'L' -> 50,
    'C' -> 100, 'D' -> 500, 'M' -> 1000)

  s.toUpperCase.map(numerals).foldLeft((0,0)) {
    case ((sum, last), curr) =>
      (sum + curr + (if (last < curr) -2*last else 0), curr) }._1

}
romanToInt("iv")

