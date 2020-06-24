package com.beverages.shop.BeveragePriceCalculator


object OrderFormator {

  def formatOrder(order:String):Tuple2[String,Array[String]]={
     val orderList=order.split(",",2)
     if(orderList.length<2)
       return(order,Array.empty)
     val orderListFomated=orderList(1).replace("-","").split(",")//.toList.map(x=>x.replace("-",""))
     return (orderList(0),orderListFomated)
  }

}
