package com.jjh.variance

object VarianceExampleApp1 extends App {

  class Fruit
  case class Apple(name: String) extends Fruit
  case class Carrot(colour: String = "Orange") extends Fruit

  class ShoppingBag[T]

  val fruits = new ShoppingBag[Fruit]
  println(fruits)
  val apples = new ShoppingBag[Apple]
  println(apples)

  //val fruits2: ShoppingBag[Fruit] = new ShoppingBag[Apple]

  // val fruits: ShoppingBag[Fruit] = apples

}
