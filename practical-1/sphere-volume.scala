def calculateVolume(radius: Double): Double = {
  val volume = (4.0/3.0) * math.Pi * math.pow(radius, 3)
  volume
}

def main(args: Array[String]): Unit = {
    val radius = 5.0
    val volume = calculateVolume(radius)
    println(s"The volume of the sphere with radius $radius is $volume")
}