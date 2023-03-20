package week3

import scala.collection.mutable.ArrayBuffer

object MotivatingEx {
  def main(args: Array[String]): Unit = {
    var data = List(2, 3, 1, 5, 5);
    data = sort(data, (a1, a2) => a1 < a2)
    println(data)
    var names = List("Krushna", "Ram", "Sita", "Bishnu")
    val sortName = sort(names, (s1, s2) => s1.compareTo(s2) > 0)
    val names2=sort2(names) (Ordering.String)
    println(names)
  }

  // Here we need a logic to compare the list also so we need to pass that logic how the element of A can be compare
  def sort[A](list: List[A], lessThen: (A, A) => Boolean): List[A] = {
    // List are immutable in java so we need ArrayBuffer
    var data = ArrayBuffer[A]()
    data.appendAll(list)
    for (i <- 0 to data.length - 1) {
      for (j <- i to data.length - 1) {
        if (lessThen(data(i), data(j)))
          var temp = data(j);
          data(j) = data(i)
          data(i) = temp
      }
    }
    data.toList
  }
  // can be written like this also
  // we can taken an object of Ordering, it's similar to Comparator instance in java
  def sort2[A](list: List[A]) (ord: Ordering[A]): List[A] = {
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
