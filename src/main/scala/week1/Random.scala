package week1

trait Generator[+T] :
  def generate() : T
  // this will take function as argument and convert the random of type T to S
  def map[S] (f: T=>S) = new Generator[S]:
    override def generate()= f(Generator.this.generate())
  // this will take a function which transform T into a generator type S
  def flatMap[S] (f: T => Generator[S])= new Generator[S] {
    override def generate(): S = f(Generator.this.generate()).generate()
  }

object Random extends  App {
  val integers = new Generator[Int] {
    val rand = java.util.Random();

    def generate() = rand.nextInt()
  }
  val booleanRand= new Generator[Boolean] {
    override def generate(): Boolean = integers.generate() > 0
  }
  println(integers.generate())
  println(booleanRand.generate())

  val paris= new Generator[(Int, Int)] {
    override def generate(): (Int, Int) = (integers.generate(), integers.generate())
  }
  println(paris.generate())

  // With help of the map method we need to create Generator object of each type, as done in line 19 booleanRand
  val boolRand2=integers.map(a => a>0)
  println(boolRand2.generate())
  // not able understand this
  val paris2= integers.flatMap(a => new Generator[Int] {
    override def generate(): Int = integers.generate()} ).generate();
  println(paris2);

  def pairs[T,U] (t: Generator[T], u: Generator[U])= t.flatMap(a => u.map( b => (a, b)))

  println("number are "+pairs(integers,integers))


}
