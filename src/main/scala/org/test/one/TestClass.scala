package org.test.one

class TestClass(counter: Int = 0) {
  def addFromCounter(message: String) = {
    val result: StringBuilder = new StringBuilder(message)
    for (i <- 1 to 5) {
      result.append(" ").append(counter + i)
    }

    result.toString()
  }
}
