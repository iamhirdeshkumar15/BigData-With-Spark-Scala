

object CelsiusToFahrenheit {
  def main(args: Array[String]) {
    val celsius = 25
    val fahrenheit = (celsius * 9 / 5) + 32
    println(s"$celsius Celsius is equal to $fahrenheit Fahrenheit")
  }
}