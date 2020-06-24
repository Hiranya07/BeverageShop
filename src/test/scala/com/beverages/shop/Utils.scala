package com.beverages.shop

import scala.collection.immutable.Map

object Utils {
  val baverageToPrice =Map("Coffee"->5,"Chai"-> 4,"Banana Smoothie"->6,"Strawberry Shake" ->6,"Mojito"->7)
  val ingredentsToPrice=scala.collection.immutable.Map[String,Double]("milk" -> 1,
    "sugar" ->0.5,
    "soda"-> 0.5,
    "mint"-> 0.5,
    "water"-> 0.5)
  val beverageToIntegrements=Map("Coffee" ->"Coffee, milk, sugar, water","Chai"-> "Tea, milk, sugar, water","Banana Smoothie"-> "banana, milk, sugar, water","Strawberry Shake"->"Strawberries, sugar, milk, water")
}
