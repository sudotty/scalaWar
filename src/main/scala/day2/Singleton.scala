/**
  * Created by sin13cos14 on 16/10/14  23:05.
  */
class Marker(val color: String) {
  print("Creating" + this)

  override def toString: String = "marker color" + color
}

object MarkerFactory {
  private val markers = Map(
    "red" -> new Marker("red"),
    "blue" -> new Marker("blue"),
    "green" -> new Marker("green")
  )

  def getMarkers(color: String) = {
    if (markers.contains(color))
      markers(color)
    else
      null
  }
}

println(MarkerFactory getMarkers "blue")
println(MarkerFactory getMarkers "blue")
println(MarkerFactory getMarkers "red")
println(MarkerFactory getMarkers "red")
println(MarkerFactory getMarkers "yellow")