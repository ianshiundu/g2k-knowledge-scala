import scala.io.Source
def countingValleys(n: Int, s: String): Int = {

  var valleys: Int = 0
  var sealevel: Int = 0
  if (n == s.toCharArray.length) {
    s.toCharArray.foreach(char ⇒ { if (char == 'D') {
      sealevel -= 1 }
    else {
      sealevel += 1
    }
      if (sealevel == 0 && char == 'U') {
        valleys += 1
      }
    })

    valleys
  } else throw new Error("Number of steps not Equal to strings")
}

//val countingV: (Int, String) ⇒ Int = (n: Int, s: String) ⇒ {
////  val lines = Source.stdin.getLines().toList
////  val steps = lines.tail.head
//
//  var valleys: Int = 0
//  var sealevel: Int = 0
//  if (n == s.toCharArray.length) {
//    s.toCharArray.foreach(char ⇒ { if (char == 'D') {
//      sealevel -= 1 }
//    else {
//      sealevel += 1
//    }
//    if (sealevel == 0 && char == 'U') {
//      valleys += 1
//    }
//    })
//
//    valleys
//} else throw new Error("Number of steps not Equal to strings")
//}

countingValleys(12, "DDUUDDUDUUUD" )
