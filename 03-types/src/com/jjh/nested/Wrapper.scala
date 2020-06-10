package com.jjh.nested

object Wrapper {

  class Inner {
    override def toString = "Inner()"
  }

}

object NestClassApp extends App {
  val inst: Wrapper.Inner = new Wrapper.Inner();
  println(inst)
  println(inst.getClass.getCanonicalName)
}
