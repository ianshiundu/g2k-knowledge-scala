import scala.annotation.tailrec

val list = List(1,2,3,4)

def sum(list: List[Int]): Int = list match {
  case Nil ⇒ 0
  case head :: tail ⇒ head + sum(tail)
}

@tailrec
private def sumWithAccumulator(list: List[Int],
                               accumulator: Int): Int = {
  list match {
    case Nil ⇒ accumulator
    case head :: tail ⇒ sumWithAccumulator(tail, accumulator + head)
  }
}


sum(list)


def product(list: List[Int]): Int = list match {
  case Nil ⇒ 1
  case x :: xs ⇒ x * product(xs)
}

product(list)


// Nil = 1
// x.head * product(x.tail)