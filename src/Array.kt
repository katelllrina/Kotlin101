fun sum(arr: Array<Int>): Int {
    var result = 0
    for (i in 0..<arr.size) {
        result += arr[i]
    }
    return result
}

fun prod(arr: Array<Int>): Int {
    var result = 1
    for (i in 0..<arr.size) {
        if (arr[i] == 0) return 0
        result *= arr[i]
    }
    return result
}


fun hasZero(arr: Array<Int>): Boolean {
    for (i in arr) {
        if (i == 0) return true
    }
    return false
}


fun findIndex(arr: Array<String>, str: String): Int {
    for (i in 0..<arr.size) {
        if (arr[i] == str) return i
    }
    return -1
}


fun equal (arr1: Array<Int>, arr2: Array<Int>): Boolean {
    if (arr1.size != arr2.size) return false
    for ( i in 0..<arr1.size) {
        val c1 = arr1[i]
        val c2 = arr2[i]
        if (c1 != c2) return false
    }
    return true
}

// zeroNegative(2, -1, 3, -5) = arrayOf(2, 0, 3, 0)
fun zeroNegative(arr: Array<Int>): Array<Int> {
    val result = Array(arr.size) { 0 }
    for (i in 0..<arr.size) {
        if (arr[i] > 0) result[i] = arr[i]
    }
    return result
}

// squareEverything(2, -1, 3, -5) = arrayOf(4, 1, 9, 25)
fun squareEverything(arr: Array<Int>): Array<Int> {
    val result = Array(arr.size) { 0 }
    for (i in 0..<arr.size) {
        result[i] = arr[i] * arr[i]
    }
    return result
}

fun main () {
    val arrayExample = arrayOf(23, 14, 5, 42)
    val emptyArray = arrayOf<Int>()
    val names = arrayOf("Kate", "Dima")

    println(emptyArray.joinToString())
    println(arrayExample.joinToString())
    println(names.joinToString())

    println(sum(arrayExample))
    println(sum(arrayOf(23, 14, 5, 42)))
    println(prod(arrayOf(2, 3, 5, 2)))

    println(hasZero(arrayOf(2, 3, 5, 2, 0, 4)))

    println(findIndex(names,"Kate"))
    println(findIndex(names,"Dim"))

    println(equal(arrayOf(2, 3, 5, 2, 0, 4), arrayOf(2, 3, 5, 2, 0, 4)))
    println(equal(arrayOf(2, 3, 5, 2, 2, 4), arrayOf(2, 3, 5, 2, 0, 4)))
    println(equal(arrayOf(2, 3, 5, 2, 2, 4), arrayOf(2, 3, 5, 2, 0)))

    println("=== zeroNegative ===")
    println(zeroNegative(arrayOf(2, -1, 3, -1)).joinToString())

    println(squareEverything(arrayOf(2, -7, 3, -1)).joinToString())
}