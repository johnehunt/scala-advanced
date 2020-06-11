package com.jjh.variance

object VarianceExampleApp2 extends App {

  class Fruit
  case class Apple(name: String = "Braeburn") extends Fruit
  case class Carrot(colour: String = "Orange") extends Fruit

  class ShoppingBag[+T]

  val fruits = new ShoppingBag[Fruit]
  println(fruits)
  val apples = new ShoppingBag[Apple]
  println(apples)

  val fruits2: ShoppingBag[Fruit] = apples
  println(fruits2)

}
