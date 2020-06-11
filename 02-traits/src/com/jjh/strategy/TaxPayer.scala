package com.jjh.strategy

trait TaxPayer {
  def calculateTax(salary: Long): Long
}

trait SelfEmployed extends TaxPayer {
  override def calculateTax(salary: Long): Long = {
    (salary * 0.1).toLong
  }
}

trait Employed extends TaxPayer {
  override def calculateTax(salary: Long) = salary * 0.3 toLong
}

class Employee {
  // explicit self type 
  // tie the class to another type (which will be implemented in future)
  self: TaxPayer =>

  def calculatePayments: Unit = {
    println(calculateTax(30000))
  }
  
}

object StrategyTest extends App {
  val e1 = new Employee with SelfEmployed 
  e1.calculatePayments
  
  val e2 = new Employee with Employed
  e2.calculatePayments
}
