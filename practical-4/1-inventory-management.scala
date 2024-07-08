object InventoryManagementSystem extends App {
  var itemNames: Array[String] = Array("Apples", "Bananas", "Oranges")
  var itemQuantities: Array[Int] = Array(10, 20, 15)

  def displayInventory(): Unit = {
    println("Current Inventory:")
    itemNames.zip(itemQuantities).foreach { case (name, quantity) =>
      println(s"$name: $quantity")
    }
  }

  def restockItem(itemName: String, quantity: Int): Unit = {
    val index = itemNames.indexOf(itemName)
    if (index != -1) {
      itemQuantities(index) += quantity
      println(s"Restocked $itemName. New quantity: ${itemQuantities(index)}")
    } else {
      println(s"Item $itemName does not exist in inventory.")
    }
  }

  def sellItem(itemName: String, quantity: Int): Unit = {
    val index = itemNames.indexOf(itemName)
    if (index != -1) {
      if (itemQuantities(index) >= quantity) {
        itemQuantities(index) -= quantity
        println(
          s"Sold $quantity of $itemName. Remaining quantity: ${itemQuantities(index)}"
        )
      } else {
        println(
          s"Not enough $itemName in stock to sell. Available quantity: ${itemQuantities(index)}"
        )
      }
    } else {
      println(s"Item $itemName does not exist in inventory.")
    }
  }

  // Example usage
  displayInventory()
  restockItem("Apples", 5)
  sellItem("Bananas", 10)
  sellItem(
    "Oranges",
    20
  ) // This should print a message indicating not enough stock
}
