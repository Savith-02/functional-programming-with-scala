object NameFormatter {
  def toUpper(name: String): String = name.toUpperCase

  def toLower(name: String): String = name.toLowerCase

  def formatNames(name: String)(formatter: String => String): String =
    formatter(name)

  def main(args: Array[String]): Unit = {
    val names = List("Benny", "Niroshan", "Saman", "Kumara")

    // Applying specific formatting rules directly within the println statement for clarity
    println(formatNames(names(0))(toUpper))
    println(
      formatNames(names(1))(name => name.head.toUpper + name.tail.toLowerCase)
    )
    println(formatNames(names(2))(toLower))
    println(
      formatNames(names(3))(name =>
        name.dropRight(1).toLowerCase + name.takeRight(1).toUpperCase
      )
    )
  }
}
