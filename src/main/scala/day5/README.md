# 自适应类型

## Tips

1. scala在编写的时候通常不需要制定类型,在编译期会进行类型推导.

2. import java.util._ 之中的"_"等同于Java中的*

3. scala 中Nothing是所有的类的子类,new ArrayList就是new ArrayList[Nothing]的实例,不可能添加任何类型的实例到其中.
因为Nothing是最底层的子类

## Any 类型

1. Any的两个后代,一个是AnyVal,这是所有基本类型的基类;一个是AnyRef,这个就是所有应用对象的基类.使用AnyRef就跟在Java中使用Object的一样
即:AnyRef直接映射为Object,Any和AnyVal则是通过类型擦除成了Object

## Nothing 类型

1. Nothing是所有类型的子类
2. Nothing是抽象的,可以替换Scala中任何东西

## Option 类型



