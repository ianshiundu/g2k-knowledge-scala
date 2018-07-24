var statusCodes = Map[String, Double]()

statusCodes += ("Not Found" -> 404)
statusCodes += ("OK" -> 200)
statusCodes += ("Found" -> 302)
statusCodes += ("No Content" -> 204)

println(statusCodes("Not Found"))


// check if user voted
var voted = Map[String, Boolean]()

def checkVoter(name: String): Unit = {
  if (voted.exists(_ == (name, true))) {
    println("Kick them out")
  } else {
    voted += (name -> true)
    println("Let them vote!")
  }
}

checkVoter("ian")
checkVoter("ian")

var graph = Map[String, List[String]]()

graph += ("you" -> List("Alice", "Bob", "Claire"))

println(graph("you"))