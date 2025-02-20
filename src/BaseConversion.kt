fun lastDigit(n: Int): Int {
    return n % 10
}

fun cutDigit(n: Int): Int {
    return n / 10
}

fun cutMiddleDigit(n: Int): Int {
    // return n / 10 % 10
    return lastDigit(cutDigit(n))
}

fun sumDigit2(n: Int):Int {
  return lastDigit(n) + cutDigit(n)
}

fun sumDigit2Alternative(n: Int): Int {
    val last = lastDigit(n)
    val first = cutDigit(n)
    return last + first
}

fun sumDigit3(n: Int):Int {
    return lastDigit(n) + cutMiddleDigit (n) + cutDigit(cutDigit(n))
    // return lastDigit(n) + lastDigit(cutDigit(n)) + cutDigit(cutDigit(n))
}

fun sumDigit3Alternative(n: Int): Int { // n = 34
    val cut = cutDigit(n) // 3
    val last = lastDigit(n) // 4
    val middle = lastDigit(cut) // 3
    val first = cutDigit(cut) // 0
    return last + middle + first
}

fun sumDigits(n: Int): Int {
    var res = 0
    var cut = n
    while (cut > 0) {
        val last = lastDigit(cut)
        cut = cutDigit(cut)
        res += last
    }
    return res
}

fun main() {
    println(lastDigit(2356))

    println(cutDigit(56))

    println( sumDigit2 (12))

    println( sumDigit3 (345))

    println( sumDigit3Alternative(345))

    println( sumDigit3Alternative(34))

    println (sumDigits(517))
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