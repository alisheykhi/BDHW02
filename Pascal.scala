object Pascal {
  def pascal(c: Int, r: Int): Int = {
    if (c < 0 || r < 0 || c > r)
      throw new IllegalArgumentException("Invalid input!")
    else{
      if (c == 0 || c == r)
        1
      else {
        pascal(c - 1, r - 1) + pascal(c, r - 1)
      }
    }
  }

  def main(args: Array[String]): Unit = {
    println("Enter column: ")
    val c = scala.io.StdIn.readLine().toInt
    println("Enter roW: ")
    val r = scala.io.StdIn.readLine().toInt
    println("pascal("+c+", "+r+"): "+pascal(c, r))
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }
}
