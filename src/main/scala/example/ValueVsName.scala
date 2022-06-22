package example

object ValueVsName {
  def main(args: Array[String]): Unit = {

    def callByValue( i : Int) ={
      println("Begin of callByValue")
      println("value of I " +i )
    }
    // Here the method will be pass as it is and it will be evaluate when we want the value from the method
    def callByName( i : => Int) ={
      println("Begin of callByName")
      //println("value of I " +i )
    }
    // it's like int ...a in java
    def sum (i : Int*) ={
      for ( k <- i)
        println(k)
    }

    // function call
    def doSomeThing()={
      println("begin of doSomeThing")
      5
    }
    callByValue(doSomeThing())
    callByName(doSomeThing())
    sum(1,2,3,5)
  }
}
