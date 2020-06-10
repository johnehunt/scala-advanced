package com.jjh.reflect

object ClassTagExampleApp extends App {

  case class Person(name: String)

  val dataMap: collection.Map[String, Any] =
    Map("Number" -> 1,
      "Greeting"->"Hello World",
      "Person" -> Person("John"))

  import scala.reflect._

  def getValueForType[T : ClassTag](key:String): Option[T] = {
    dataMap.get(key) match {
      case Some(value: T) => Some(value)
      case _ => None
    }
  }

  println(getValueForType[String]("Person")) // None
  println(getValueForType[Person]("Person")) // Instance of Person

}
