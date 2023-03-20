package week3

trait Physics {
  implicit def air: Gaz
  implicit def condense(implicit gaz: Gaz): Liquid
  implicit def freeze(implicit liquid: Liquid): Solid
  implicitly[Solid] // implicitly[Solid](freeze(condense(air)))
}
case class  Gaz (a: Int)
case class  Liquid (a: Int)
case class  Solid (a: Int)


