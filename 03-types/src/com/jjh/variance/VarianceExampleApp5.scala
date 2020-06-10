package com.jjh.variance

object VarianceExampleApp5 {
  class Fruit
  case class Apple(name: String) extends Fruit
  case class Carrot(colour: String = "Orange") extends Fruit

  class ShoppingBag[+T](private val stuff: T*) {
    def get: T = stuff.head
    def put [X >: T] (data: X) = new ShoppingBag( stuff :+ data )
  }

  val apples = new ShoppingBag[Apple]
  println(apples)

  val fruits2: ShoppingBag[Fruit] = apples
  println(fruits2)
}
