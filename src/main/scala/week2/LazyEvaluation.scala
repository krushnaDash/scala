package week2

object LazyEvaluation {
  def main(args: Array[String]): Unit = {
    lazy val a= someFun();
  }
  def someFun():Int={
    println("Some func called")
    10
  }
}
