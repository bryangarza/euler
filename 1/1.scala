object Euler1 {
  def main(args: Array[String]) {

    var a = 0
    var sum = 0

    while(a < 1000) {
      if(a % 3 == 0 || a % 5 == 0) {
        sum += a
      }
      a += 1
    }

    println(sum)
  }
}
