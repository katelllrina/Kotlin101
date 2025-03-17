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


fun main() {
    println(countZeros(arrayOf(2, 0, 3, 0)))
    println(countZeros(arrayOf(0, 0, 0, 0)))
    println(countZeros(arrayOf(0, 0, 0, 0, 0, 4)))
    println(count(arrayOf(2, 2, 2, 0), 2))
    println(count(arrayOf(2, 0, 3, 0), 3))
}
