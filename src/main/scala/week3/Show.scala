package week3

trait Show[A] {
  def apply(a: A): String
}
object Show {
  implicit val showInt: Show[Int] = new Show[Int] {
    def apply(n: Int): String = s"Int($n)"
  }
  def printValue[A: Show](a: A): Unit = {
    println(implicitly[Show[A]].apply(a))
  }


  def main(args: Array[String]): Unit = {
    printValue(42)
  }
  implicitly[Show[Int]]
}

