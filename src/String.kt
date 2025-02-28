fun hasZero(str: String): Boolean {
    var i = 0
    while (i < str.length) {
        if (str[i] == '0') return true
        i += 1
    }
    return false
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

    val xxx = "It's Friday!"
    println(xxx)
    println(xxx[0])
    println(xxx[1])
    println(xxx[2])
    println(xxx[4])
    println(xxx[5])
//    println(str[99])
}