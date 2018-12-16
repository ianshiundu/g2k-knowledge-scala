
case class Foo(id: Int, location: Option[String])

object FooRepoitory {
  private val foo = Map(1 → Foo(1, Some("London")),
                        2 → Foo(2, None))

  def findById(id: Int): Option[Foo] = foo.get(id)
}

// when using map
val location = FooRepoitory.findById(1).map(_.location)

// when using flatmap
val locationWithFlatMap = FooRepoitory.findById(1).flatMap(_.location)