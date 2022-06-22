package example

object CasePattern {
def main( args: Array[String]) : Unit ={
  var someSMS=SMS("8123904149","Hello Scala")
  var someEmail=Email("test@test.com","Hello","Subject")
  println(showNotification(someSMS))
  println(showNotification(someEmail))
}
trait Notification{}

case class SMS(sender: String, sms: String) extends Notification
case class Email(sender: String, body: String, subject: String) extends  Notification
case class Tweet(Sender: String, tweet: String) extends  Notification

def showNotification(notification: Notification) : String ={
  notification match {
    case SMS(sender, sms) => s"you got an SMS from $sender and here is the sms $sms"
    case Email(s, b, subject) => s"you got an email from ${s} and with subject $subject with body $b"
    case Tweet(sender, tweet) => s"your tweet is $tweet"
  }
}

}
