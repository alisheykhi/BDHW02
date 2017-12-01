object Logic {
  def and(a:Boolean,b:Boolean):Boolean = if (a & b)  true else false
  def or(a:Boolean,b:Boolean):Boolean = if (a | b) true else false
  def xor(a:Boolean,b:Boolean):Boolean = if (a ^ b) true else false
  //pattern matching
  def and1(a:Boolean,b:Boolean):Boolean =(a,b) match {
    case (true,true)  => true
    case (a,b) => false
  }
  def or1(a:Boolean,b:Boolean):Boolean =(a,b) match {
    case (false,false)  => false
    case (a,b) => true
  }
  def xor1(a:Boolean,b:Boolean):Boolean =(a,b) match {
    case (a,b) if a==b  => false
    case (a,b) => true
  }

  def main(args: Array[String]): Unit = {
    println("Enter first boolean:")
    val a:Boolean = scala.io.StdIn.readLine().toBoolean
    println("Enter second boolean:")
    val b:Boolean = scala.io.StdIn.readLine().toBoolean
    println("and("+a+", "+b+"): "+and(a,b))
    println("and1("+a+", "+b+"): "+and1(a,b))
    println(" or("+a+", "+b+"): "+or(a,b))
    println(" or1("+a+", "+b+"): "+or1(a,b))
    println("xor("+a+", "+b+"): "+xor(a,b))
    println("xor1("+a+", "+b+"): "+xor1(a,b))
  }

}
