package week4

object LoopEx {

  def main(args: Array[String]): Unit = {
    var p=2
    var base=2;
    whileDo(p>0)({base=base*base; p=p-1})
    println(base)
  }

  def whileDo(condition: => Boolean ) (command : => Unit) : Unit =
    if (condition) {
      command
      whileDo(condition)(command)
    }else
      ()
}
