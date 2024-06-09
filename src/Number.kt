fun printWhile() {
    var i = 0
    while (i < 10) {
        println("i is now: $i")
        i += 1
    }
}

// Examples:
//   isDivisible(28, 7) = true
//   isDivisible(64, 10) = false
fun isDivisible(a: Int, b: Int): Boolean {
    var i = a
    while (i > b) {
        i -= b
    }
    return i == b
}

fun remainder (a: Int, b: Int): Int {
    var i = a
    while (i >= b) {
        i -= b
    }
    return i
}

fun isDivisible2(a: Int, b: Int): Boolean =
    remainder(a, b) == 0

fun div (a: Int, b: Int) : Int {
    var i = a
    var count = 0
    while (i >= b) {
        i -= b
        count += 1
    }
    return count
}

// Examples:
//  isEven(10) = true
//  isEven(17) = false
fun isEven(n: Int): Boolean =
    n % 2 == 0

fun isOdd(n: Int): Boolean =
    n % 2 != 0
//  n % 2 == 1

/*
  collatz-next:
    if (isEven(n)) { n / 2 } else { 3 * n + 1 }

  collatz-sequence:
    repeat collatz-next until result is 1

Example:
  2 -> 1
  3 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1
 */
fun printCollatzSequence(n: Int) {
    var x = n
    var sequence = "$n"
    while (x > 1) {
       val next = if (isEven(x)) { x / 2 } else { 3 * x + 1 }
        x = next
        sequence += " -> $x"
    }
    println(sequence)
}

fun main() {
    println(isDivisible(72, 8))
    println(isDivisible(47, 5))
    println(isDivisible2(72, 8))
    println(isDivisible2(47, 5))
    println(remainder(72, 8))
    println(remainder(47, 5))
    println(div(23, 7))

    println(34 / 7) // division
    println(34 % 7) // modulus

    printCollatzSequence(3)
    printCollatzSequence(7)
    printCollatzSequence(27)
}