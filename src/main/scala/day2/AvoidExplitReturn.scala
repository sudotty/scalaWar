/**
  * Created by sin13cos14 on 16/10/13  00:36.
  */
class AvoidExplicitReturn {
  def check1() = true

  def check2(): Boolean = return true //有return,那么就显示的指定返回类型,最好不加,scala会自动推断
  println(check1())
  println(check2())

}
