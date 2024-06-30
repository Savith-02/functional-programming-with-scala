object takeMean extends App {
  def mean(a: Int, b: Int): Double = {
    (a + b) / 2.0
  }

  val a = 10
  val b = 20
  val meanValue = mean(a, b)

  println(f"Mean of $a and $b is $meanValue%.2f")
}
