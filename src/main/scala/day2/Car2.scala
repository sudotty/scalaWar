package day2

/**
  * Created by sin13cos14 on 16/10/13  00:45.
  */
class Car2(val year: Int) {
  private var milesDriven: Int = 0

  def miles() = milesDriven

  def driven(distant: Int): Unit = {
    milesDriven += Math.abs(distant)
  }
}

// val car2 = new Car(2009)
// println(car2.year)
// println(car2.miles)
// car.driven(10)
// println(car.miles)