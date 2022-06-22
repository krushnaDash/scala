package example

trait HelloWorld {
 def sayHello(): Unit;
 def grret(message: String):Unit={
   println("default method Hello" + message)
 }
}
