package example

class Greet (prefix: String ){

  def greet(name : String): Unit =
    println( "Hello " + prefix +" " +name)

}
