
package org.test.one

object ScalaApp {
  def main(args: Array[String]): Unit = {
    var list = List[Int](1, 4, 5)
    list = list :+ 4

    var arr: Array[Int] = Array(1, 1, 1, 1)
    arr = 0 +: arr :+ 5
    arr.foreach(elem => print(elem + " "))
    println()

    arr.distinct.foreach(elem => print(elem + " "))
  }
}
