package week1

abstract  class JSON

object JSON :
  case class Seq (e : List[JSON]) extends  JSON
  case class Obj (data : Map [String, JSON]) extends  JSON
  case class Num (value : Double) extends  JSON
  case class Bool(b : Boolean) extends  JSON
  case class Str( s: String) extends  JSON
  case object Null extends  JSON

/**
 *  {
 *   "firstName" : "John"
 *   "LastName" : "Smith",
 *   "Address" : {
 *    "State": "OD"
 *    "Pin" : 768104
 *    },
 *    "phoneNumber" : [{"type" : "JIO", "number","8123904149"},{"type" : "Airtel", "number","8123904149"},]
 *  }
 *
 */

@main
def main(): Unit = {
  val JsonData = JSON.Obj(Map("firstName" -> JSON.Str("John")
    , "LastName" -> JSON.Str("Smith")
    , "Address" -> JSON.Obj(Map("State" -> JSON.Str("OD"), "Pin" -> JSON.Num(768104)))
    , "phoneNumber" -> JSON.Seq(List(JSON.Obj(Map("type" -> JSON.Str("JIO"), "number" -> JSON.Str("8123904149") ))))

  )
  )
  println(TestJosn showJson JsonData)
}
object TestJosn {
  def showJson(json: JSON): String = {
    json match {
      case JSON.Bool(b) => b.toString
      case JSON.Null => "null"
      case JSON.Num(value) => value.toString
      case JSON.Obj(data) =>  val someList=data.map {
        (key,value) => s"${(key)} : ${showJson(value)}"
      }
        someList.mkString("[",", ","]")

      case JSON.Seq(e) => e.map(showJson).mkString("[",", ","]")

      case JSON.Str(s) => s
      case _ => ""
    }
  }
}


