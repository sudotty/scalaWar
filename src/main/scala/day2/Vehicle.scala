package day2

/**
  * Created by sin13cos14 on 16/10/13  01:21.
  */
class Vehicle(val id: Int, val year: Int) {
  override def toString: String = "ID" + id + "Year:" + year
}

class Car(override val id: Int, override val year: Int, var fueLevel: Int) extends Vehicle(id, year) {
  override def toString: String = super.toString + " Fuel Level:" + fueLevel
}

// val car = new Car(1,2009,100)
// println(car)
// 取消注释执行结果