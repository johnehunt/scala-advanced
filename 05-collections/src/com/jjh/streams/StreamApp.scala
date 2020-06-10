package com.jjh.streams

object StreamApp extends App {
  // Pre Scala 2.13
  val stream = 3 #:: 2#:: 4 #:: Stream.empty
  println(stream)
  stream.foreach(println _)

  println("-" * 25)

  val stream2 = stream.map{_*2}
  stream2.foreach(println _)

  println("-" * 25)

  val stream3 = (1 to 10).toStream
  println(stream3)
  val stream4 = stream3.take(5)
  stream4.foreach(println _)

}
