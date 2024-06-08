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

fun main() {
    println(isDivisible(72, 8))
    println(isDivisible(47, 5))
    println(isDivisible2(72, 8))
    println(isDivisible2(47, 5))
    println(remainder(72, 8))
    println(remainder(47, 5))
}