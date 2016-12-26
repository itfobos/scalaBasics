
package org.test.one

object ScalaApp {
  def main(args: Array[String]): Unit = {
    println(Counter.increaseCounter)

    println(new Counter().increaseCounter)

  }
}
