
package org.test.one

object ScalaApp {
  def main(args: Array[String]): Unit = {
    var counterEntity = CounterEntity(2)
    println(counterEntity.counter)

    counterEntity = counterEntity.copy(counter = counterEntity.counter * 2)
    println(counterEntity.counter)
  }
}
