package week5

trait Subscriber {
  def handler(pub: Publisher): Unit
}

trait Publisher {
  private var subscribers: Set[Subscriber] = Set();

  def subscribe(subscriber: Subscriber) = subscribers += subscriber

  def unSubscribe(subscriber: Subscriber) = subscribers -= subscriber

  def publish(): Unit = {
    subscribers.foreach(s => s.handler(this))
  }
}

class BankAccount extends Publisher :
  private var balance = 0
  def currentBalance() : Int = balance
  def deposit(amount: Int): Unit = balance += amount; publish()

  def withdraw(amount: Int): Unit = {
    if (balance < amount)
      throw Error(" No enough balance")
    else {
      balance -= amount
      publish()
    }
  }

