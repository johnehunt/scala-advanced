package com.jjh.reflect

class Person
class Trade

object InstanceFactory {

  import scala.reflect.runtime.universe

  def getInstance[T: universe.TypeTag] : T = {
    val mirror = universe.runtimeMirror(getClass.getClassLoader)
    val clazz = universe.typeOf[T].typeSymbol.asClass
    val classMirror = mirror.reflectClass(clazz)
    val constructor = universe.typeOf[T].decl(
                          universe.termNames.CONSTRUCTOR).asMethod
    val constructorMirror = classMirror.reflectConstructor(constructor)
    constructorMirror().asInstanceOf[T]
  }

}

object InstanceCreationApp extends App {
  val inst1 = InstanceFactory.getInstance[Person]
  println(inst1)
  val inst2 = InstanceFactory.getInstance[Trade]
  println(inst2)
}
