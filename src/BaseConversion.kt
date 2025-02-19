fun lastDigit(n: Int): Int {
    return n % 10
}

fun cutDigit(n: Int): Int {
    return n / 10
}

fun sumDigit(n: Int):Int {
  return lastDigit(n) + cutDigit(n)
}
fun main() {
    println(lastDigit(2356))

    println(cutDigit(56))

    println( sumDigit (77))
}

/*
fun main() {
    // Simple printing
    println("Hello, world!")
    println(42)
//    println(16 * 8) - weird
    println("16 * 8")
    // println("16" * "8") - invalid
    println(true)
//    println(true && false) - we understand
}

 */