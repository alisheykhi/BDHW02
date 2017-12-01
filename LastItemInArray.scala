object LastItemInArray {

  def lastItemInArray[T](x:List[T]): T ={
      return x.last
  }

  def main(args: Array[String]): Unit = {
    println("Enter a list of numbers or characters(delimiter is space):")
    def x = scala.io.StdIn.readLine().split(" ").toList
    println("The last item is: "+lastItemInArray(x))

//    def x = (0 to 50).toList
//    def y = List("A","B","C")
//    println("Last item in list is: "+lastItemInArray(x))
//    println("Last item in list is: "+lastItemInArray(y))
  }

}
