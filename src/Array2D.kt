fun printArray2D(arr: Array<Array<Int>>) {
    val rowSize = arr.size
    val colSize = arr[0].size
    for (i in 0..<rowSize) {
        for (j in 0..<colSize) {
            print(arr[i][j])
            print(" ")
        }
        println()
    }

}


fun createSimpleArray2D(rowSize: Int, colSize: Int): Array<Array<Int>> {
    val result = Array(rowSize) { Array(colSize) { 0 } }
    var count = 0
    for (i in 0..<rowSize) {
        for (j in 0..<colSize) {
            count += 1
            result[i][j] = count
        }
    }
    return result
}


fun createSnakeArray2D(rowSize: Int, colSize: Int): Array<Array<Int>> {
    val result = Array(rowSize) { Array(colSize) { 0 } }
    var count = 0
    for (i in 0..<rowSize) {
        if (i % 2 == 0) {
            for (j in 0..<colSize) {
                count += 1
                result[i][j] = count
            }
        } else {
            for (j in colSize - 1 downTo 0) {
                count += 1
                result[i][j] = count
            }
        }
    }
    return result
}


fun main() {
    val arrayExample = arrayOf(
        arrayOf(1, 2, 3, 4),
        arrayOf(5, 10, 0, 7),
        arrayOf(9, 21, 57, -2)
    )

    printArray2D(arrayExample)

    printArray2D(createSimpleArray2D(7, 5))
    printArray2D(createSnakeArray2D(5, 4))
}