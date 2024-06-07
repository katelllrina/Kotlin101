// Example: 47 = 40 + 7
// Digits: 4 and 7

// Example: numberFromTwoDigits(4, 7) = 47
fun numberFromTwoDigits(left: Int, right: Int): Int =
    left * 10 + right

// Example: numberFromThreeDigits(4, 9, 3) = 493
fun numberFromThreeDigits(one: Int, two: Int, three: Int): Int =
    one * 100 + two * 10 + three

fun numberFromFourDigits(one: Int, two: Int, three: Int, four: Int): Int =
    one * 1000 + two * 100 + three * 10 + four

fun main() {
    println(numberFromTwoDigits(5, 7))
    println(numberFromTwoDigits(0, 8))
    println(numberFromThreeDigits(4, 8, 5))
    println(numberFromFourDigits(2, 0, 2, 4))
}