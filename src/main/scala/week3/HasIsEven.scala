package week3

import scala.language.implicitConversions

implicit class HasIsEven(n: Int) {
  def isEven: Boolean = n % 2 == 0
}

object TestApp extends  App {
  val a=42.isEven
  println(a)
  val b= new HasIsEven(42).isEven

}

