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


fun pow2 (n: Int): Int {
    var result = 1
    for (i in 1..n) {
        result *= 2
    }
    return result
}

///6//

fun pow (base: Int, exponent: Int, ): Int {
    var result = 1
    for (i in 1..exponent) {
        result *= base
    }
    return result
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
    println(pow2(5))
    println(pow2(2))
    println(pow2(1))
    println(pow2(0))
    println(pow(5, 2))
    println(pow(2, 5))
    println(pow(1, 6))
    println(pow(9, 3))

}




