object sumEven extends App {
  def sumEven(numbers: List[Int]): Int = {
    if (numbers.length == 0) 0
    else if (numbers.head % 2 == 0) numbers.head + sumEven(numbers.tail)
    else sumEven(numbers.tail)
  }

  println(sumEven(List(10, 23, 31, 44, 53, 62, 70, 85, 96, 100)))
}
