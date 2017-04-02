
package org.test.one

object ScalaApp {
  def main(args: Array[String]): Unit = {
    val testClassInstance = CounterEntity(8)

    testClassInstance == CounterEntity(8)

    println(testClassInstance)
  }
}
