package problems

fun countSimilar(arr1: Array<String>, arr2: Array<String>): Int {
    var count = 0
    for (word1 in arr1) {
        for (word2 in arr2) {
            if (word1 == word2) {
                count += 1
                break
            }
        }
    }
    return count
}

fun countSimilar2(arr1: Array<String>, arr2: Array<String>): Int {
    var count = 0
    for (i in 0..<arr1.size) {
        for (j in 0..<arr2.size) {
            if (arr1[i] == arr2[j]) {
                count += 1
                break
            }
        }
    }
    return count
}

fun main() {
    println(countSimilar(arrayOf("apple", "orange", "banana", "blue"), arrayOf("red", "blue", "orange")))
}