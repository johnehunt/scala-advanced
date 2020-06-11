package com.jjh.variance

package com.jjh.variance

object VarianceExampleApp3 extends App {

  class Fruit
  case class Apple(name: String = "Braeburn") extends Fruit
  case class Carrot(colour: String = "Orange") extends Fruit

  class ShoppingBag[+T](private val stuff: T*) {
    def get: T = stuff.head

    // def put(data: T): Unit = {} // Won't compile…
  }

  val apples = new ShoppingBag[Apple]
  println(apples)

  val fruits2: ShoppingBag[Fruit] = apples
  println(fruits2)

}

