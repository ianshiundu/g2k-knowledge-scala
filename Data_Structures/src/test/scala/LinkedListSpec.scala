import org.scalatest.{Matchers, WordSpec}

class LinkedListSpec extends WordSpec with Matchers {
  "linked list" should {
    "map correctly" in {
      val original = LinkedList(2, 3, 4)
      original map (x ⇒ x * x) === LinkedList(4, 9, 16)
    }

    "foldLeft summing all numbers" in {
      val original = LinkedList(2, 3, 4)
//      original.foldLeft(0)(a, item) ⇒ acc
    }
  }
}
