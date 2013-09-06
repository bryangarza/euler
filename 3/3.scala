object Euler3 {
  def main(args: Array[String]) {

    val limit = 600851475143L

    var n = (limit / 2) + 1
    while(isPrime(n) == false || limit % n != 0 ) {
      n -= 1
    }

    println(n)

    def isPrime(n: Long) = {


      var denom = n / 2
      var prime = true

      while(denom > 5 && prime == true) {
        if(n % denom == 0) {
          prime == false
        }
        else {
          denom -= denom
        }
      }

      if (prime == false) {
        println(n + " is not prime")
      }

      prime

    }
  }
}
