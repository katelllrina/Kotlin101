fun hasZero(str: String): Boolean {
    var i = 0  // i is index of symbol inside the string; index is a position of symbol inside the string
    while (i < str.length) {
        if (str[i] == '0') return true
        i += 1
    }
    return false
}

//fun hasZero2(str: String): Boolean {
//    for (i in 0..str.length - 1) {
//        if (str[i] == '0') return true
//    }
//    return false
//}

fun hasZero3(str: String): Boolean {
    for (i in 0..<str.length) {
        if (str[i] == '0') return true
    }
    return false
}

fun hasZero4(str: String): Boolean {
    for (char in str) {
        if (char == '0') return true
    }
    return false
}

// findIndex(str, c) - return index of c in str
// findIndex("Hello", 'e') = 1
// findIndex("Hello", 'z') = -1
// findIndex("Hello", 'l') = 2
// findIndex("Hello", 'h') = -1
fun findIndex(str: String, c: Char): Int {
    for (i in 0..<str.length) {
        if (str[i] == c) return i
    }
    return -1
}

fun findIndexRight(str: String, c: Char): Int {
    for (i in str.length - 1 downTo 0) {
        if (str[i] == c) return i
    }
    return -1
}

fun equal (str1: String, str2: String): Boolean {
    if (str1.length != str2.length) return false
    for ( i in 0..<str1.length) {
        val c1 = str1[i]
        val c2 = str2[i]
        if (c1 != c2) return false
    }
    return true
}

// createIntRangeString(9, 12) = "9 10 11 12"
// createIntRangeString(9, 9) = "9"
// createIntRangeString(9, 5) = ""
fun createIntRangeString(start: Int, end: Int): String {
    if (start > end) return "error"
    if (start == end) return "$start"

    var answer = "$start"
    for (i in start + 1..end) {
        answer += " $i"  // answer = answer + " $i"
    }
    return answer
}

// isNumber("77") = true
// isNumber("kate") = false
fun isNumber(s: String): Boolean {
    for (char in s) {
        if (!char.isDigit()) return false
    }
    return true
}

fun main() {
    println("Hello, world!")
    println("100 + 50 = 264 :(")
//    println("false")
//    println(false)
    println(hasZero("Hello"))
    println(hasZero("104"))
    println(hasZero("x"))
    println(hasZero(""))
    println(hasZero4("Hell0"))

    val xxx = "It's Friday!"
    println(xxx)
    println(xxx[0])
    println(xxx[1])
    println(xxx[2])
    println(xxx[4])
    println(xxx[5])
//    println(str[99])

    println("=== findIndex ===")
    println(findIndex("Hello", 'o'))
    println(findIndex("Hello", 'l'))
    println(findIndexRight("Hello", 'l'))

    println(equal("Hello, world!", "Hello, world!" ))
    println(equal("Hello, world!", "Hello, worhd!" ))
    println(equal("", "Hello!" ))

    println("=== createIntRangeString ===")
    println(createIntRangeString(9, 12))
    println(createIntRangeString(14, 17))
    println(createIntRangeString(13, 10))


    println(isNumber("Kate"))
    println(isNumber("777Kate"))
    println(isNumber("777"))

}