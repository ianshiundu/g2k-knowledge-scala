import scala.collection.mutable

var graph = Map[String, List[String]]()

println(graph("you"))

def search(name: String)= {
  val searchQueue = new mutable.Queue[List[String]]

  searchQueue += graph(name)

  val searched = List()

  while (searchQueue.nonEmpty) {
    val person = searchQueue.dequeue().head

    if (!searched.contains(person)) {
      if (name.endsWith("m")) {
        println(person + " is a mango seller.")
      } else {
        searchQueue += graph(person)
        person :: searched
      }
    }
  }
}

graph += ("you" -> List("alice", "bob", "claire"))
graph += ("bob" -> List("anuj", "peggy"))
graph += ("alice" -> List("peggy"))
graph += ("claire" -> List("thom", "jonny"))
graph += ("anuj" -> List())
graph += ("peggy" -> List())
graph += ("thom" -> List())
graph += ("jonny" -> List())

search("you")