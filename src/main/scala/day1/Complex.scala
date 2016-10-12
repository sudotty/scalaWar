package day1

/**
  * Created by sin13cos14 on 16/10/12  23:31.
  */
class Complex(val real: Int, val imaginary: Int) {
  def +(operand: Complex): Complex = {
    new Complex(real + operand.real, imaginary + operand.imaginary)
  }

  def *(operand: Complex): Complex = {
    new Complex(real * operand.real - imaginary * operand.imaginary, real * operand.imaginary + imaginary * operand.real)
  }

  override def toString: String = {
    real + (if (imaginary < 0) "" else "+") + imaginary + "i"
  }
}

//val c1 = new Complex(1,2)
//val c2 = new Complex(2,-3)
//val sum = c1+c2
//val multiple = c1*c2