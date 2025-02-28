

fun decimal2binary(n: Int): Int {
    var rem = n
    var res = 0
    var decimal = 1
    while (rem > 0) {
        val digit = rem % 2
        rem /= 2
        res += decimal * digit
        decimal *= 10
    }
    return res
}



fun main() {
    println("Input: n = 0 | Expected: 0 | Got: ${decimal2binary(0)}")
    println("Input: n = 1 | Expected: 1 | Got: ${decimal2binary(1)}")
    println("Input: n = 5 | Expected: 101 | Got: ${decimal2binary(5)}")
    println("Input: n = 11 | Expected: 1011 | Got: ${decimal2binary(11)}")
    println("Input: n = 16 | Expected: 10000 | Got: ${decimal2binary(16)}")
    println("Input: n = 7 | Expected: 111 | Got: ${decimal2binary(7)}")
    println("Input: n = 1023 | Expected: 1111111111 | Got: ${decimal2binary(1023)}")
    println("Input: n = 1024 | Expected: 10000000000 | Got: ${decimal2binary(1024)}")
}