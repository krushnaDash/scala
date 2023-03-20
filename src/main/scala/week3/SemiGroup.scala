package week3

trait SemiGroup[T] :
  extension (x: T) def combine(y : T): T

trait Monoid[T] extends  SemiGroup[T] :
  def unit: T

def reduce[T] (xs : List[T]) (using m :Monoid[T]): T=
  xs.foldLeft(m.unit)(_.combine(_))


