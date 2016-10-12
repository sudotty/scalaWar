/**
  * Created by sin13cos14 on 16/10/13  00:18.
  */
class Vehicle{
  protected def checkEngine(){}
}
class Car extends Vehicle{
  def start(): Unit ={
    checkEngine()
  }
  def tow(car: Car): Unit ={
    car.checkEngine()
  }
  def tow(vehicle: Vehicle): Unit ={
//    vehicle.checkEngine()   //Error
  }
}

