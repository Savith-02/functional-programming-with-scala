object RunningTimeCalculator {
  def calculateTotalTime(): Unit = {
    val easyPace = 8 
    val tempoPace = 7 

    val easyDistance = 2 
    val tempoDistance = 3

    val totalTime = (easyPace * easyDistance * 2) + (tempoPace * tempoDistance)

    println(s"The total running time is $totalTime minutes.")
  }

  def main(args: Array[String]): Unit = {
    calculateTotalTime()
  }
}