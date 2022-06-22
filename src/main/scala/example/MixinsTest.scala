package example
import scala.language.postfixOps

abstract class AbsIterator {
  type T
  def hasNext: Boolean
  def next(): T
}

class StringIterator (s: String) extends  AbsIterator {
  type T =Char;
  var i : Int=0
  override def hasNext: Boolean = i<s.length
  override def next(): Char = {
    val c=s.charAt(i)
    i=i+1;
   c
  }
}

trait RichIterator extends  AbsIterator{
  def foreach(f: T => Unit) = while (hasNext) f(next())
}

class RischStringIterator extends StringIterator("krushna") with RichIterator



object MixinsTest {
 def main(args: Array[String]): Unit = {
   val name= new StringIterator("Krushna")
    while (name.hasNext){
      println(name.next())
    }

   val richName= new RischStringIterator;
   richName.foreach(println)
 }
}
