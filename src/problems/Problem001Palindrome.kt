package problems

// isPalindrome("neveroddoreven") = true
// isPalindrome("121") = true
// isPalindrome("hello") = false
fun isPalindrome(str: String): Boolean {
    for ( i in 0..<str.length/2 ) {
        if (str[i] != str[str.length - 1 - i])
            return false
    }
    return true
}

fun main() {
    println(isPalindrome("neveroddoreven"))
    println(isPalindrome("121"))
    println(isPalindrome("hello"))
    println(isPalindrome("1321"))
    println(isPalindrome("1212121"))
    println(isPalindrome(""))
    println(isPalindrome("1"))

}