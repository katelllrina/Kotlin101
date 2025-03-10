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
        result *= arr[i]
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
}