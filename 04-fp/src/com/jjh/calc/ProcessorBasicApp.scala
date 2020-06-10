package com.jjh.calc

class Processor(val label: String) {
  def printIt(i: Int) = println(s"$label: $i")
}

object ProcessorBasicApp extends App {
  val proc = new Processor(">")
  proc.printIt(5)
  println("-" * 20)
  val func: Int => Unit = proc.printIt
  func(5)
}
