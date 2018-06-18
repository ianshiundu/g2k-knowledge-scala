
sealed trait LinkedList[+E] {
  def map[R](f: E ⇒ R): LinkedList[R] = {
    this match {
      case Node(head, tail) ⇒ Node(f(head), tail.map(f))
      case Empty ⇒ Empty
    }
  }

  final def foldLeft[B](accumulator: B)(f: (B,E) ⇒ B): B = {
    this match {
      case Node(head, tail) ⇒ {
        val current = f(accumulator, head)
        tail.foldLeft(current)(f)
      }
      case Empty ⇒ accumulator
    }
  }
}

case class Node[+E](head: E, tail: LinkedList[E]) extends LinkedList[E]

case object Empty extends LinkedList[Nothing]

object LinkedList {
  def apply[E](items: E*): LinkedList[E] = {
    if (items.isEmpty) {
      Empty
    } else {
      Node(items.head, apply(items.tail: _*))
    }
  }
}


