
fun printArray2D (arr: Array<Array<Int>>) {
    val rowSize = arr.size
    val colSize = arr[0].size
    for (i in 0 ..<rowSize) {
        for (j in 0 ..<colSize) {
            print (arr[i][j])
            print(" ")
        }
        println()
    }

}

fun main () {
    val arrayExample = arrayOf(
        arrayOf(1,2,3,4),
        arrayOf(5,10,0,7),
        arrayOf(9,21,57,-2)
    )

    printArray2D(arrayExample)
}