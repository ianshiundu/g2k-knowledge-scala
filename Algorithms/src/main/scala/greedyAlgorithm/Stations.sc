import scala.collection.mutable
val stations = mutable.Map[String, Set[String]]()

stations += ("kone" -> Set("id", "nv", "ut"))
stations += ("ktwo" -> Set("wa", "id", "mt"))
stations += ("kthree" -> Set("or", "nv", "ca"))
stations += ("kfour" -> Set("nv", "ut"))
stations += ("kfive" -> Set("ca", "az"))

stations("kone").union(stations("kthree"))
//def finalStates(): Set[String] = {
//  val bestStation
//  if (bestStation.isDefined && bState.nonEmpty) {
//    bState
//  }
//  else {
//    stations(bestStation.get).union(bState)
//  }
//}