package week2

object InfineList {
  def main(args: Array[String]): Unit = {
    val nums= from(0)
  }
  // #:: will create a Lazy list by combining n and from(n+1)
  // :: will create List
  def from(n : Int) : LazyList[Int] = n#::from(n+1)
}
