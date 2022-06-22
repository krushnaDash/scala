package example

object TraitTest extends  HelloWorld {
  def main(args : Array[String] ) : Unit ={
    println("Hello");
    sayHello();
    grret("Krushna")
    val data: List[Any] = List(
      "A string",
      1001,
      'c',
      () => { println("A function")}
    )
    printList(data)
  }

  override def sayHello(): Unit = {
    println("Hellow world");
  }

  def printList(data: List[Any] ) ={
    data.foreach(d => println(d))
  }
}

