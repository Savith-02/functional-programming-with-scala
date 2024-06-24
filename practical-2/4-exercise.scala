object MovieTheaterProfit extends App {
  def calculateProfit(ticketPrice: Double): Double = {
    val basePrice = 15.00
    val baseAttendance = 120
    val priceChangeEffect = (basePrice - ticketPrice) / 5.00 * 20
    val attendance = baseAttendance + priceChangeEffect
    val performanceCost = 500
    val attendeeCost = attendance * 3
    val totalCost = performanceCost + attendeeCost
    val totalRevenue = ticketPrice * attendance

    totalRevenue - totalCost
  }

  def findBestTicketPrice(startPrice: Double, endPrice: Double, step: Double): (Double, Double) = {
    val prices = BigDecimal(startPrice) to BigDecimal(endPrice) by BigDecimal(step)
    val profits = prices.map(price => (price.toDouble, calculateProfit(price.toDouble)))
    val maxProfit = profits.maxBy(_._2)
    return maxProfit
  }

  val (bestPrice, maxProfit) = findBestTicketPrice(5.00, 25.00, 0.50)
  println(f"Best ticket price: Rs.$bestPrice%.2f leading to a maximum profit of Rs.$maxProfit%.2f")
}