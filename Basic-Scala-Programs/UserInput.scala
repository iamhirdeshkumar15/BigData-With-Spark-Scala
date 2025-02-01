// Added user input handling in Scala.

import scala.io.StdIn.readLine

object UserInput {
  def main(args: Array[String]) {
    print("Enter your name: ")
    val name = readLine()
    println(s"Hello, $name!")
  }
}