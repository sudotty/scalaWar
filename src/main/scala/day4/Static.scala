/**
  * Created by sin13cos14 on 16/10/16  23:02.
  */
class Marker3 private(val color: String) {
  override def toString: String = "marker color " + color
}

object Marker3 {
  private val markers3 = Map(
    "red" -> new Marker3("red"),
    "blue" -> new Marker3("blue"),
    "green" -> new Marker3("green")
  )

  def primaryColor = "red,green,blue"

  def apply(color: String) = if (markers3.contains(color)) markers3
}