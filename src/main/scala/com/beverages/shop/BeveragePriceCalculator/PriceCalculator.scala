package com.beverages.shop.BeveragePriceCalculator
import com.beverages.shop.BeverageEntry._
import com.beverages.shop.Menu.{BeverageToIntegrements, BeverageToPrice, IngredentsToPrice}
import com.beverages.shop.Menu.IngredentsToPrice._
object PriceCalculator {

  def calculatePrice(basePrice:Double,order:Array[String]): Double ={
    var totalPrice:Double=basePrice
    order.map(x=>{
      val ingredentPrice=ingredentsToPrice.getOrElse(x,0.0)
      totalPrice=totalPrice - ingredentPrice
    })
totalPrice
  }



  def totalPriceOfBeverages(order:String,bavIngreden:Map[String,String],ingredentList:Map[String,Double]): Unit ={
    if(order.contains("-")) {
      val formattedOrder = OrderFormator.formatOrder(order)

      val ingreList = bavIngreden(formattedOrder._1)
      val validExcludeItemsNotExceedTotalIngredents = InputValidator.validateInput(ingreList, formattedOrder._2)
      if (validExcludeItemsNotExceedTotalIngredents) {
        var validIngredent = true
        val validateIngrdents = formattedOrder._2.map(x => {
          val ret = InputValidator.validIngreDent(x, ingredentList)

          if (!ret) {
            validIngredent = false
          }
        })

        val basePrice = BeverageToPrice.baverageToPrice(formattedOrder._1)
        if (validIngredent) {
          val totalPrice = PriceCalculator.calculatePrice(basePrice, formattedOrder._2)
          println(totalPrice)
        }

      }
    }
    else{
      println(BeverageToPrice.baverageToPrice(order))
    }

  }







}
