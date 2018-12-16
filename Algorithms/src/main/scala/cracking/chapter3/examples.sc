import scala.collection.mutable

var q = new mutable.Queue[String]()

q += "apples"
q += "bananas"
q ++= List("oranges", "strawberries", "pears")
q.enqueue("grapes", "guava")
q

q.dequeue()
q
q.dequeueFirst(_.startsWith("b"))
q