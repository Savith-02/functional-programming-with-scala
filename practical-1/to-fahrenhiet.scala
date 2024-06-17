def toFahrenhiet(temp: Double): Double = {
    temp * 9/5 + 32
}

def main(args: Array[String]): Unit = {
    val temp = 37.0
    val fahrenhiet = toFahrenhiet(temp)
    println(s"$temp degrees Celsius is $fahrenhiet degrees Fahrenhiet")
}