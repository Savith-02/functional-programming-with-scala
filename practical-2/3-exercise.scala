object SalaryCalculator extends App {
  def calculateTakeHomeSalary(normalHours: Int, otHours: Int): Double = {
    val normalRate = 250
    val otRate = 85
    val taxRate = 0.12

    val grossSalary = (normalHours * normalRate) + (otHours * otRate)
    val taxAmount = grossSalary * taxRate
    val takeHomeSalary = grossSalary - taxAmount

    takeHomeSalary
  }

  val normalHours = 40
  val otHours = 30
  val takeHomeSalary = calculateTakeHomeSalary(normalHours, otHours)

  println(f"Take home salary: Rs.$takeHomeSalary%.2f")
}