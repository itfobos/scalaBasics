
package org.test.one

object ScalaApp {
  def main(args: Array[String]): Unit = {
    var set: Set[Int] = Set(1, 444, 44, 444, 8)

    println(set(4))
    println(set.toList)
  }
}