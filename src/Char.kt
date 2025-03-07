// isDigit('7') = true
// isDigit('H') = false
fun isDigit(c: Char): Boolean {
    if ('0' == c) return true
    if ('1' == c) return true
    if ('2' == c) return true
    if ('3' == c) return true
    if ('4' == c) return true
    if ('5' == c) return true
    if ('6' == c) return true
    if ('7' == c) return true
    if ('8' == c) return true
    if ('9' == c) return true
    else return false
}

fun isDigit2(c: Char): Boolean {
    return ('0' == c || '1' == c || '2' == c || '3' == c || '4' == c || '5' == c || '6' == c || '7' == c || '8' == c || '9' == c)
}

fun isDigit3(c: Char): Boolean {
    return when (c) {
        '0' -> true
        '1' -> true
        '2' -> true
        '3' -> true
        '4' -> true
        '5' -> true
        '6' -> true
        '7' -> true
        '8' -> true
        '9' -> true
        else -> false
    }
}

fun isDigit4(c: Char): Boolean {
    return ('0' <= c && c <= '9')
}


fun main () {
    println("=== isDigit ===")
    println (isDigit('7'))
    println (isDigit('h'))

    println("=== isDigit2 ===")
    println (isDigit2('7'))
    println (isDigit2('h'))

    println("=== isDigit3 ===")
    println (isDigit3('7'))
    println (isDigit3('h'))

    println("=== isDigit4 ===")
    println (isDigit4('7'))
    println (isDigit4('h'))
}