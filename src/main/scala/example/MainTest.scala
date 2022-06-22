package example

object MainTest {
   def  main(args: Array[String]): Unit = {
    println({
      val x = 1+1
      x+1
      x+2
    })
     println(addOne(5))
     println(addThenMultiply(1, 2)(3))

     new Greet("Mr").greet("Krushna")
     Test.test()
     val point1=Point(1,3)
     val point2=Point(1,3)
     var point3=Point(2,3)
     println(point1==point2)
     point3=point2;
     println(point3==point2);

     println(Counter.count());
     println(Counter.count());
  }
  val addOne =(x: Int) => x+1
}

def addThenMultiply(x: Int, y: Int)(multiplier: Int): Int = (x + y) * multiplier

case class Point(x: Int, y: Int)

object Counter{
  private var ctr=0;
  def  count(): Int = {
   ctr+=1;
    ctr;
  }
}
