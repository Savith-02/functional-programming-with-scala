import scala.io.StdIn.readLine

object stringReverse extends App {
  def reverseString(str: String): String = {
    if (str.isEmpty) ""
    else reverseString(str.tail) + str.head
  }

  println("Please enter a string:")
  val str = readLine()
  val reversedStr = reverseString(str)
  println(s"Original string: $str")
  println(s"Reversed string: $reversedStr")
}