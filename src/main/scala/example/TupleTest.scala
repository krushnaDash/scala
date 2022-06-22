package example

object TupleTest {
  def main(args: Array[String]) :Unit ={
    val ingredient = ("Sugar" , 25)
    println("Number "+ingredient._1+ " name "+ ingredient._2);
  var data=getStudent()
    println("Number "+data._1+ " name "+ data._2);

  }

  def getStudent() ={
    (1001,"Krushna") // this return a tuple
  }
}
