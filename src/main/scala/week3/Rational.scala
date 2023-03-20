package week3

import scala.language.implicitConversions

case class Rational(numerator: Int, denominator: Int)

object Rational {
  implicit def fromInt(n: Int) :Rational = Rational(n, 1)
}
object TestApp2 extends  App {
  val r: Rational = 42
  println(r)
}
