package com.jjh.reflect

object TypeTagExampleApp2 extends App {

  import scala.reflect.runtime.universe._

  case class Info[T: TypeTag] (data: T) {
    val tpe = typeOf[T]
  }

  println(Info[String]("").tpe == typeOf[String]) // true
  println(Info[String]("").tpe == typeOf[Int])    // false

}
