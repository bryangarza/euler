object Euler2 {
  def main(args: Array[String]) {

    var arr = List(1, 2)

    while(arr.last < 4000000) {
      arr = arr :+ arr.takeRight(2).sum
    }

    val filteredArr = arr.filter(x => x % 2 == 0)
    println(filteredArr.sum)

  }
}
