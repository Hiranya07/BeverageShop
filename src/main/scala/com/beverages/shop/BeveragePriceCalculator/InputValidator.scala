package com.beverages.shop.BeveragePriceCalculator
import com.beverages.shop.Menu._

object InputValidator {

  def validateInput(ingredents:String,orderedIngre:Array[String]):Boolean= {
     var result=true
      val countOfIngredents=ingredents.split(",").length
      if(orderedIngre.length>=countOfIngredents)
        false
    result
  }


  /****
    *
    * @param ingredent
    * @param ingredentMap
    * @return
    */

  //Check if all the ingredents are from menu item
  def validIngreDent(ingredent:String,ingredentMap:Map[String,Double]): Boolean={

      val ret=ingredentMap.getOrElse(ingredent," ")

      if(ret!= " ")
        true
      else
        false
  }

}
