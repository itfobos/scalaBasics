package org.test.one

class CounterEntity(val counter: Int = 0) {
}

object CounterEntity {
  def apply(): CounterEntity = new CounterEntity(1)

  def apply(counter: Int): CounterEntity = new CounterEntity(counter * 2)
}