package com.jjh.nested

class Graph2 {

  class Node {
    var connectedNodes: List[Graph2#Node] = Nil

    def connectTo(node: Graph2#Node): Unit = {
      if (!connectedNodes.exists(node.equals)) {
        connectedNodes = node :: connectedNodes
      }
    }
  }

  var nodes: List[Node] = Nil

  def newNode: Node = {
    val res = new Node
    nodes = res :: nodes
    res
  }
}

object Graph2App extends App {
  println("Starting")
  val graph1: Graph2 = new Graph2
  val node1 = graph1.newNode
  val node2: graph1.Node = graph1.newNode
  node1.connectTo(node2) // legal

  // Create a second graph object
  val graph2: Graph2 = new Graph2
  val node3 = graph2.newNode
  node1.connectTo(node3) // Now also legal
  println("Done")
}
