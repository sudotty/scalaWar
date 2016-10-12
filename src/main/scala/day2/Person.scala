package day2

import scala.beans.BeanProperty

/**
  * Created by sin13cos14 on 16/10/13  01:06.
  */
class Person(val firstName: String, val lastName: String) {
  private var position: String = _
  @BeanProperty  var age:Int = _
  println("Creating " + toString())

  def this(firstName: String, lastName: String, positionHeld: String) {
    this(firstName, lastName)
    position = positionHeld
  }

  override def toString: String = {
    firstName + " " + lastName + " holds" + position + " position"
  }
}

// val jack = new Person("sin13","cos14","DWS")
// println(john)
// val bill = new Person("Bill","Walker")
// println(bill)