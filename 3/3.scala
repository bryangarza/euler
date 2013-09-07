object Euler3 {
  def main(args: Array[String]) {

    var limit = 600851475143L

    lazy val primes: Stream[Long] =
    Stream.cons(2,
      primes.map(x => {var tmp = x
        (while ((limit % tmp) != 0 && limit != 1) { tmp += 1 });
        limit = limit / tmp;
        tmp}))

    print(primes.take(10).last)

  }
}
