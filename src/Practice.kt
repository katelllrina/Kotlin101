//30//
fun countZeros(arr: Array<Int>): Int {
    var count = 0
    for (i in 0..<arr.size) {
        if (arr[i] == 0) count += 1
    }
    return count
}

////



fun main() {
    println(countZeros(arrayOf(2, 0, 3, 0)))
    println(countZeros(arrayOf(0, 0, 0, 0)))
    println(countZeros(arrayOf(0, 0, 0, 0, 0, 4)))
}
