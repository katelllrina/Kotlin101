//30//
fun countZeros(arr: Array<Int>): Int {
    var count = 0
    for (i in 0..<arr.size) {
        if (arr[i] == 0) count += 1
    }
    return count
}

////31//
fun count(arr: Array<Int>, number: Int): Int {
    var count = 0
    for (i in 0..<arr.size) {
        if (arr[i] == number) count += 1
    }
    return count
}

///32//

fun maximum(arr: Array<Int>): Int {
    var max = arr[0]
    for (i in 0..<arr.size) {
        if (max < arr[i]) max = arr[i]
    }
    return max
}

///33//

fun minimum(arr: Array<Int>): Int {
    var min = arr[0]
    for (i in 0..<arr.size) {
        if (min > arr[i]) min = arr[i]
    }
    return min
}

///34//
fun countSmall(arr: Array<String>, number: Int): Int {
    var count = 0
    for (i in 0..<arr.size) {
        if (arr[i].length <= number) count += 1
    }
    return count
}


///5//


fun pow2(n: Int): Int {
    var result = 1
    for (i in 1..n) {
        result *= 2
    }
    return result
}

///6//

fun pow(base: Int, exponent: Int): Int {
    var result = 1
    for (i in 1..exponent) {
        result *= base
    }
    return result
}

//7//

fun isPowerOf2(n: Int): Boolean {
    if (n == 0) return false
    var cut = n
    while (cut > 1) {
       if (cut % 2 != 0) return false
        cut /= 2
    }
    return true
}

//8//

fun isPowerOf(base: Int, n: Int): Boolean {
    if (n == 0) return false
    if (n == 1) return true
    var cut = base
    while ( cut < n) {
       cut *= base
    }
    return cut == n
}

///9//

fun biggestPowerOf2(n: Int): Int {
    if (n == 1) return -1
    var base = 1
    while ( base < n) {
        base *= 2
    }
    return base / 2
}

fun smallestPowerOf2(n: Int): Int {
    if (n == 1) return -1
    var base = 1
    while ( base < n) {
        base *= 2
    }
    return base
}
fun main() {
    println(countZeros(arrayOf(2, 0, 3, 0)))
    println(countZeros(arrayOf(0, 0, 0, 0)))
    println(countZeros(arrayOf(0, 0, 0, 0, 0, 4)))
    println(count(arrayOf(2, 2, 2, 0), 2))
    println(count(arrayOf(2, 0, 3, 0), 3))
    println(maximum(arrayOf(2, 0, 3, 1)))
    println(maximum(arrayOf(5, 6, 9, 4)))
    println(minimum(arrayOf(2, 0, 3, 1)))
    println(minimum(arrayOf(5, 6, 9, 4)))
    println(countSmall(arrayOf("dishes", "fire", "beautiful", "wife", "apple", "affordable"), 7))
    println(countSmall(arrayOf("hi", "buy", "good", "yes", "no", "affordable"), 2))
    println("Practice 4")
    println(pow2(5))
    println(pow2(2))
    println(pow2(1))
    println(pow2(0))
    println(pow(5, 2))
    println(pow(2, 5))
    println(pow(1, 6))
    println(pow(9, 3))
    println("Practice 7")
    println(isPowerOf2(16))
    println(isPowerOf2(15))
    println(isPowerOf2(1))
    println(isPowerOf2(18))
    println("Practice 8")
    println(isPowerOf(3, 81))
    println(isPowerOf(3, 15))
    println(isPowerOf(3, 1))
    println(isPowerOf(3, 27))
    println(isPowerOf(4, 64))
    println(isPowerOf(3, 55))
    println(isPowerOf(5, 625))
    println(isPowerOf(2, 8))
    println(isPowerOf(2, 10))
    println("Practice 9")
    println(biggestPowerOf2(156))
    println(biggestPowerOf2(15))
    println(biggestPowerOf2(65))
    println(biggestPowerOf2(33))
    println(biggestPowerOf2(1))
    println(smallestPowerOf2(156))
    println(smallestPowerOf2(15))
    println(smallestPowerOf2(65))
    println(smallestPowerOf2(33))
    println(smallestPowerOf2(1))




}




