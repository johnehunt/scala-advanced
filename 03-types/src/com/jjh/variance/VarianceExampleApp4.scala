package com.jjh.variance

class VarianceExampleApp4 extends App {
  class Fruit
  case class Apple(name: String = "Braeburn") extends Fruit
  case class Carrot(colour: String = "Orange") extends Fruit

  class ShoppingBag[-T](private val stuff: T*)

  val fruits = new ShoppingBag[Fruit]
  println(fruits)

  val apples = new ShoppingBag[Apple]
  println(apples)

  val apples2: ShoppingBag[Apple] = fruits
  println(apples2)
}
