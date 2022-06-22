package week1
trait M[A] {
  def flatMap[B] ( f: A=> M[B]) : M[B]
  def unit (a:A ): M[A]
}
object Monads {
  def main(args: Array[String]): Unit = {
    // let take example of List Monad

    val f= (i: Int) => List(i+"-1", i+"0", i+"1");
    val data= List(5,6,7);
    println(data.flatMap(f)) // this will flat the list
    println(data.map(f))

    val numbers=List.apply(1,2,3) // it's like the unit function
    // using flat map and unit acive the map functionlity, here apply is a like Unit method
    // here data is List(1,2,3) and with a Map function we want to convert this into List("K1","K2", "K3")
    println(numbers.map(a=> "K"+a))
    println(numbers.flatMap( a => List.apply("K"+a)));
    // Map is FlatMap+Unit

    // Monads Laws
    //left -identity law
    // unit(x).flatmap(f)==f(x)

    val l=List.apply(1).flatMap(x=> "K"+x)
    println("left identity "+l)

    // right identity law
    // m.flatMap(Unit) == m
    val sameNumbers= numbers.flatMap(x => List.apply(x))
    println(sameNumbers)

    // associativity law
    //m.flatMap(f).flatMap(g) == m.flatMap(x=> f(x).flatMap(g))

    // practical usage of Monad, ex : get all the Grand children of User
    //https://medium.com/free-code-camp/demystifying-the-monad-in-scala-cc716bb6f534


    }



}


