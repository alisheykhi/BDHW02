
object GCD {
  def gcd(a: Int, b: Int): Int = {
    if(b==0)
      a
    else
      gcd(b,a%b)
  }

  def main(args: Array[String]): Unit = {
    println("Enter a:")
    val sa = scala.io.StdIn.readLine()
    println("Enter b:")
    val sb = scala.io.StdIn.readLine()
    val a: Int = sa.toInt
    val b: Int = sb.toInt
    println("gcd("+a+","+b+")= "+gcd(a,b))
//    println("gcd(10,2)    = "+gcd(10,2))
//    println("gcd(20,10)   = "+gcd(20,10))
//    println("gcd(17,4)    = "+gcd(17,4))
//    println("gcd(54,24)   = "+gcd(54,24))
//    println("gcd(13,1)    = "+gcd(13,1))
  }
}
