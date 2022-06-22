package example

import scala.util.matching.Regex

object RegeExTest {

  def main(args: Array[String]): Unit = {
    val anyNumber: Regex ="[0-9]".r
    anyNumber.findFirstMatchIn("SomeTextWithoutNumber12") match {
      case Some(test) => println("there is some number "+test)
      case None => println("invalid password")
    }
  }

}
