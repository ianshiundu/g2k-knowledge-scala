
var graph = Map[String, Map[String, Int]]()
var cost = Map[String, Int]()
var parents = Map[String, String]()

var infinity = Double.PositiveInfinity

graph += ("start" -> Map("a" -> 6))
graph += ("start" -> Map("b" -> 2))
graph("start")

cost += ("a" -> 6)
cost += ("b" -> 2)
cost += ("fin" -> infinity.toInt)

parents += ("a"-> "start")
parents += ("b" -> "start")
parents += ("fin" -> None.toString)

cost("a")
cost("b")
cost("fin")

parents("a")
parents("b")
parents("fin")
//graph += ("start" -> (cost += ("a" -> 6)))