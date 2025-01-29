

object FahrenheitToCelsius {
  def main(args: Array[String]) {
    val fahrenheit = 77
    val celsius = (fahrenheit - 32) * 5 / 9
    println(s"$fahrenheit Fahrenheit is equal to $celsius Celsius.")
  }
}