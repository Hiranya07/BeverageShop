package com.beverages.shop
import org.scalatest.FunSpec
import BeveragePriceCalculator.PriceCalculator._
import com.beverages.shop.BeveragePriceCalculator._
class MyBeverageTest extends FunSpec {
  it("calculatePrice should calculate the price when base price of the baverage is given along with the list of exclusion"){
    val actual=calculatePrice(3.0,Array("sugar","milk"))
    assert(actual==1.5)
  }

  it(" totalPriceOfBeverages should calculate the total price of a list of order"){
    val order="Chai,-sugar"
    val actual=totalPriceOfBeverages(order,Utils.beverageToIntegrements,Utils.ingredentsToPrice)
    assert(actual==3.5)
  }

  it("validIngreDent should return true  if the ingredent is included in menu"){
    val ret=InputValidator.validIngreDent("milk",Utils.ingredentsToPrice)
    assert(ret==true)
  }

  it("validateInput Should return true if the number of excluded items is less then the total ingredents requried for the beverage"){
    val ret=InputValidator.validateInput("milk,sugar",Array("milk"))
    assert(ret==true)
  }

  it("validateInput Should return flase if the number of excluded items is less then the total ingredents requried for the beverage"){
    val ret=InputValidator.validateInput("milk",Array("milk,sugar"))
    assert(ret==true)
  }

  it(" validIngreDent should return false  if the ingredent is included in menu"){
    val ret=InputValidator.validIngreDent("milk123",Utils.ingredentsToPrice)
    assert(ret==false)
  }

 // it("Should return tuple of String and Array of string")
}
