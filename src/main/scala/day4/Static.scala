/**
  * Created by sin13cos14 on 16/10/16  23:02.
  */
class Marker private(val color: String) {
  override def toString: String = "marker color " + color
}

object Marker {
  private val markers = Map(
    "red" -> new Marker("red"),
    "blue" -> new Marker("blue"),
    "green" -> new Marker("green")
  )

  def primaryColor = "red,green,blue"
}