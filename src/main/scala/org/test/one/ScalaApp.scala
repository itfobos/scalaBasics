
package org.test.one

object ScalaApp {
  def main(args: Array[String]): Unit = {
    val testClass: TestClass = new TestClass(8)
    val repResult: String = testClass.addFromCounter(repAmount = 4, message = "Basis")

    println(repResult)

  }
}
