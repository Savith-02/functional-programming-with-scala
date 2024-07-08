object PatternMatcher {
  def main(args: Array[String]): Unit = {
    args.headOption match {
      case Some(value) =>
        try {
          val number = value.toInt
          val result = number match {
            case n if n <= 0     => "Negative/Zero is input"
            case n if n % 2 == 0 => "Even number is given"
            case _               => "Odd number is given"
          }
          println(result)
        } catch {
          case _: NumberFormatException =>
            println("Please provide a valid integer.")
        }
      case None =>
        println(
          "No input provided. Please run the program with an integer argument."
        )
    }
  }
}
