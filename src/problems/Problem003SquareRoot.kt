package problems

// sqr(5) = 25
// sqr(-3) = 9
fun sqr (n: Long): Long {
    return n * n
}

// sqrt(25) = 5
// sqrt(49) = 7
// sqrt(10) = -1

// ugly code
fun sqrt (n: Int): Int {
    for (i in 0.. n) {
        if (i * i == n) return i
        if (i * i > n) return -1
    }
    return -1
}

fun sqrt2 (n: Int): Int {
    var i = 0
    while (i * i < n) {
        i += 1
    }
    return if (i * i == n) i else -1
}

fun main () {
    println(sqr (5))
    println(sqr (-4))
    println(sqr (1000000000000))
    println(sqrt(25))
    println(sqrt(10))
    println(sqrt2(25))
    println(sqrt2(10))

}