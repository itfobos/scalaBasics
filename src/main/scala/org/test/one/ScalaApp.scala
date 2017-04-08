
package org.test.one

object ScalaApp {
  def main(args: Array[String]): Unit = {
    var counterEntity = CounterEntity()
    println(counterEntity.counter)

    counterEntity = CounterEntity(3)
    println(counterEntity.counter)
  }
}
