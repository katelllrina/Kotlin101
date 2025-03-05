package problems

import kotlin.math.*

//fun minimum(x: Int, y: Int): Int {
//    return if (x > y) y else x
//}

// commonPrefix("flower", "flour") = "flo"
// commonPrefix("flower", "friday") = "f"
// commonPrefix("hello", "world") = ""
// commonPrefix("kate", "kate") = "kate"
fun commonPrefix(str1: String, str2: String): String {
    if (str1 == "" || str2 == "") return ""
    var answerLength = 0
    for (i in 0 ..< min(str1.length, str2.length)) {
        if (str1[i] != str2[i]) break
        answerLength += 1
    }
    return str1.substring(0..<answerLength)
}

fun main () {
    println(commonPrefix("flower", "flour"))
    println(commonPrefix("flower", "friday"))
    println(commonPrefix("hello", "world"))
    println(commonPrefix("kate", "kate"))
    println(commonPrefix(" kate", "kate"))
    println(commonPrefix("2347", "2348"))
    println(commonPrefix("kat", "kate"))
    println(commonPrefix("flour", "flower"))
    println(commonPrefix("kate", "kat"))
    println(commonPrefix("Hello", "hello"))
    println(commonPrefix("A", "A"))
    println(commonPrefix("B", "A"))
    println(commonPrefix("", "A"))
    println(commonPrefix("Kate", ""))


}