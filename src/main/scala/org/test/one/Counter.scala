package org.test.one

object Counter {
  private var counter: Int = 0

  def increaseCounter: Int = {
    counter = counter + 1

    counter
  }
}

class Counter {
  def increaseCounter: Int = {
    Counter.counter = Counter.counter + 1

    Counter.counter
  }
}
