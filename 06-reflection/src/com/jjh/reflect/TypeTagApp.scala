package com.jjh.reflect

object TypeTagApp extends App {

  import scala.reflect.runtime.universe.typeTag
  val intTypeTag = typeTag[Int]
  println(intTypeTag)
  println(intTypeTag.tpe)

  val personTypeTag = typeTag[Person]
  println(personTypeTag)
  println(personTypeTag.tpe)

  println("-" * 25)

  import scala.reflect.classTag
  val stringClassTag = classTag[String]
  println(stringClassTag)

  val personClassTag = classTag[Person]
  println(personClassTag)

}
