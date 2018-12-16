import scala.collection.mutable

var graph = Map[String, List[String]]()
graph += ("you" -> List("alice", "bob", "claire"))
graph += ("bob" -> List("anuj", "peggy"))
graph += ("alice" -> List("peggy"))
graph += ("claire" -> List("thom", "jonny"))
graph += ("anuj" -> List())
graph += ("peggy" -> List())
graph += ("thom" -> List())
graph += ("jonny" -> List())

val something = new mutable.Queue[List[String]]

something += graph("you")


def search(name: String)= {
  val searchQueue = new mutable.Queue[List[String]]

  val searched = (searchQueue += graph(name)).toList

  while (searchQueue.nonEmpty) {
    val person = searchQueue.dequeue()

    if (!searched.contains(person)) {
      if (name.endsWith("m")) {
        println(person + " is a mango seller.")
      } else {
        searchQueue += graph(person.filter(s => s.endsWith("m")).head)
        person :: searched
      }
    }
  }
}




//search("you")
//println(graph("you"))