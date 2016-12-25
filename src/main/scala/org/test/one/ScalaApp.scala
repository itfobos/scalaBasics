
package org.test.one

object ScalaApp {
  def main(args: Array[String]): Unit = {
    val a = new TestClass(7)

    println(a.addFromCounter("some message"))
  }
}
