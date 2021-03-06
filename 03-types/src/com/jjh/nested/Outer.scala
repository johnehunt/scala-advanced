package com.jjh.nested

class Outer(val age: Int) {

  class Inner {
    val x = 5
    def printer(): Unit = {
      println(s"Inner.x $x, outer $age")
    }
  }

}

object SampleApp extends App {
  val myOut = new Outer(8)
  val myIn = new myOut.Inner()
  myIn.printer()
}