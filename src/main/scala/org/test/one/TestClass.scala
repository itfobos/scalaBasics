package org.test.one

class TestClass(counter: Int = 0) {
  def addFromCounter(message: String = "", repAmount: Int = 1) = {
    val result: StringBuilder = new StringBuilder(message)
    for (i <- 1 to repAmount) {
      result.append(" ").append(counter + i)
    }

    result.toString()
  }
}
