package day5

import java.util._

/**
  * Created by sin13cos14 on 16/10/17  21:01.
  */
class Generics2 {
  var list1 = new ArrayList[Int]
  var list2 = new ArrayList

  //list2 = list1
  //上述语句编译错误,这是因为list2实际上创建的是一个ArrayList[Nothing]的实例
  //在Scala中,Nothing是所有类的子类.,这样,list2就不可能添加任何类型的实例
}