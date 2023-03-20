package week3

import scala.collection.mutable.ArrayBuffer

object ImplicitParameter {
  def main(args: Array[String]): Unit = {
    val names = List("A", "Z", "P") // here we need to pass the OrderdType compile will find and pass
    println(sort(names))
    println(sort(names) (Ordering.String.reverse))

    implicit val n: Int = 42
    def f(implicit x: Int) = x
    println(f)
    println(f(0))

    implicit val world: String = "World"
    def greet(implicit name: String) = s"Hello, $name!"
    println(greet)

  }

  def sort[A](list: List[A])(implicit ord: Ordering[A]): List[A] = {
    // List are immutable in java so we need ArrayBuffer
    var data = ArrayBuffer[A]()
    data.appendAll(list)
    for (i <- 0 to data.length - 1) {
      for (j <- i to data.length - 1) {
        if (ord.lt(data(i), data(j)))
          var temp = data(j);
          data(j) = data(i)
          data(i) = temp
      }
    }
    data.toList
  }
}
