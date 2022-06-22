package week1

case class Book(name: String, authors: List[String])
object ForEx {
 val books : List[Book] =List( Book("java", List("krushna","Ram"))
   , Book("C++", List("Shyam","Bishnu"))
   , Book("C#", List("Shweta","Ram")) )



  def main(args: Array[String]): Unit = {
    // find the name of the books whose authors is Ram
   val data= for a <- books
        b <- a.authors
        if b.startsWith("Ram")
    yield a.name
    println(data)

    // using high order function
    val data2 = books.flatMap(b =>
      b.authors.withFilter(a => a.startsWith("Ram")).map(x => b.name))
    println(data2)

    println(books.flatMap(b => b.authors))
  }

}
