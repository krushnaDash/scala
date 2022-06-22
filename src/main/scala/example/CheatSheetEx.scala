package example

import scala.collection.mutable.ArrayBuffer

object CheatSheetEx extends  App {
  println("Hello")
  var frutList= List("Apple", "Mango") // In Scala List are immutable
  for(s <- frutList)
    println(s)
  frutList=frutList.updated(1,"other") // create a new List and assign to frutList
  frutList=frutList :+ "New Fruit" // create a new List and New Fruit at the end
  frutList= "Start Fruit" +: frutList // create a new List and add start fruit at begning
  for(s <- frutList)
    println(s)

  var anotherList= ArrayBuffer("A","B","C"); // this is similar to ArrayList for java
  for(s <- anotherList)
    println(s)
  end for
    anotherList.addOne("D")
    anotherList insert (0,"Start")
  anotherList foreach(s => println(s))

  // create a Map

  var myMap= Map( "krushna" -> 100, "Ram" -> 200)
  println(myMap("Ram"))
  myMap= myMap.updated("Krushna",200) // create a new Map
  println(myMap("Krushna"))

  // create a mutable map
  var anotherMap= scala.collection.mutable.Map( "krushna" -> 100, "Ram" -> 200)
  anotherMap.put("Ram",300)
  println(anotherMap)

}


