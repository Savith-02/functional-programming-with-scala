object stringFilter extends App {
    def filtrStrings(strings: List[String]): List[String] = {
        strings.filter(_.length > 5)
    }
    val strings: List[String] = List("apple", "banana", "orange", "grapes", "kiwi", "mango", "papaya")
    val filteredStrings = filtrStrings(strings)
    println(s"Original strings: $strings")
    println(s"Filtered strings: $filteredStrings")
}