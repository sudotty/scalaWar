/**
  * Created by sin13cos14 on 16/10/15  22:47.
  */
class Marker private(val color: String) {
  println("Creating" + this)

  override def toString: String = "marker color " + color
}
object Marker{

}