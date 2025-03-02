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
}