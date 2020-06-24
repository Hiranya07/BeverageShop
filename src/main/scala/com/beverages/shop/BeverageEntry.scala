package com.beverages.shop

import Menu._
import BeveragePriceCalculator._

object BeverageEntry extends App {


  val orderList=List("Chai,-sugar", "Chai", "Coffee,-milk")
  val ingredentList=IngredentsToPrice.ingredentsToPrice
  val bavIngreden=BeverageToIntegrements.beverageToIntegrements
  orderList.map(order=>PriceCalculator.totalPriceOfBeverages(order,bavIngreden,ingredentList))

}
