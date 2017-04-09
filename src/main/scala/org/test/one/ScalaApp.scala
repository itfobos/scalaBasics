
package org.test.one

object ScalaApp {
  def main(args: Array[String]): Unit = {
    var ourVal = Option("Some str")
    println(ourVal.map(str => null).getOrElse("Default"))

    println(ourVal.flatMap(str => None).getOrElse("Default"))
  }
}