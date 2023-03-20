package week3

trait Ring[A] {
  def plus(a1: A, a2: A): A

  def multy(a1: A, a2: A): A

  def inverse(x: A): A

  def zero: A

  def one: A

}

object Ring {

  implicit val ringInt: Ring[Int] = new Ring[Int] {
    override def plus(a1: Int, a2: Int): Int = a1 + a2

    override def multy(a1: Int, a2: Int): Int = a1 * a2

    override def inverse(x: Int): Int = -x

    override def zero: Int = 0

    override def one: Int = 1
  }
  def checkRing(implicit a: Ring[Int])={
    println(a.zero)
  }

  def plusAssociativity[A](x: A, y: A, z: A)(implicit ring: Ring[A]): Boolean =
    ring.plus(ring.plus(x, y), z) == ring.plus(x, ring.plus(y, z))

}
object mainApp extends  App{
  // argument will be passed implicitly
  Ring.checkRing
}
