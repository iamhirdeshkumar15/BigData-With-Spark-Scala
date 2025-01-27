

object CountVowels {
  def main(args: Array[String]) {
    val str = "Hello Scala World!, My Name is Hirdesh Kumar."
    val vowels = "aeiou"
    val count = str.count(c => vowels.contains(c.toLower))
    println(s"The number of vowels in '$str' is $count")
  }
}