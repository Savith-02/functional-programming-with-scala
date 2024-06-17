object Global {
    var discount: Double = 40.0
    var cost = 24.95
    var shipping_cost_first_50 = 3
    var shipping_cost_additional = 0.75
}

def calculatePrice(quantity: Int): Double = {
    var price = quantity * Global.cost * (100 - Global.discount) / 100
    
    if (quantity <= 50) {
        return price + quantity * Global.shipping_cost_first_50
    } else {
        return price + 50 * Global.shipping_cost_first_50 + (quantity - 50) * Global.shipping_cost_additional
    }
}

def main(args: Array[String]): Unit = {
    val quantity = 60
    val price = calculatePrice(quantity)
    println(s"The price for $quantity items is $price")
}