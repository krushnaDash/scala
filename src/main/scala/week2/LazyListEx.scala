package week2

object LazyListEx {
  def main(args: Array[String]): Unit = {
  // finding the second prime number from 1000 to 10000

    // performance wise this one is very bad as it will calculate all the prime number and then pick the second one
    // it will calculate all the prime num from 1000 to 10000
    val num=List.range(1000,10000).filter(isPrime)(1)
    println(num)

    // Better solution with a LazyList
    // it will compute when it's required here it will give the number from 1000 to 1013 only as it's got the number 1013 is 2nd prime
    val primeNum=LazyList.range(1000,10000).filter(isPrime)(1)
    println(primeNum)

  }
  def isPrime(num: Int): Boolean ={
    var flag=0
    for(i <- (2 to num/2) ){
      if (num%i ==0) {
         return false
      }
    }
    flag==0
  }

}
