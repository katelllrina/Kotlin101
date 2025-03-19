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
    for (i in 0 ..<arr.size) {
      if (max < arr[i])  max = arr[i]
    }
return max
}

///33//

fun minimum(arr: Array<Int>): Int {
    var min = arr[0]
    for (i in 0 ..<arr.size) {
        if (min > arr[i])  min = arr[i]
    }
    return min
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
}
