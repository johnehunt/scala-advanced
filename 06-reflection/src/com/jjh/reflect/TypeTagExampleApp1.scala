package com.jjh.reflect

object TypeTagExampleApp1 extends App {

  case class Info[T](data: T)

  println(Info[String]("").isInstanceOf[Info[String]]) // true
  println(Info[String]("").isInstanceOf[Info[Int]]) // ?? also true

}
