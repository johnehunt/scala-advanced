package com.jjh.streams

object LazyListApp extends App {

  // Post Scala 2.13
  // Use LazyList (which is fully lazy) instead of Stream (which has a lazy tail only)

  val lazyList = 3 #:: 2#:: 4 #:: LazyList.empty
  println(lazyList)
  lazyList.foreach(println _)

  println("-" * 25)

  val lazyList2 = lazyList.map{_*2}
  lazyList2.foreach(println _)

  println("-" * 25)

  val lazyList3 = LazyList.empty concat (1 to 10)
  println(lazyList3)
  val lazyList4 = lazyList3.take(5)
  lazyList4.foreach(println _)
}
