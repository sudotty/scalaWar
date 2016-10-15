/**
  * Created by sin13cos14 on 16/10/15  22:47.
  */
class Marker2 private(val color: String) {
  println("Creating" + this)

  override def toString: String = "marker color " + color
}

object Marker2 {
  private val markers = Map(
    "red" -> new Marker2("red"),
    "blue" -> new Marker2("blue"),
    "green" -> new Marker2("green")
  )

  def getMarker(color: String) = {
    if (markers.contains(color)) markers(color) else null;
  }
}