import kotlin.math.min

//30//
fun countZeros(arr: Array<Int>): Int {
    var count = 0
    for (i in 0..<arr.size) {
        if (arr[i] == 0) count += 1
    }
    return count
}

////31//
fun count(arr: Array<Int>, number: Int): Int {
    var count = 0
    for (i in 0..<arr.size) {
        if (arr[i] == number) count += 1
    }
    return count
}

///32//

fun maximum(arr: Array<Int>): Int {
    var max = arr[0]
    for (i in 0..<arr.size) {
        if (max < arr[i]) max = arr[i]
    }
    return max
}

///33//

fun minimum(arr: Array<Int>): Int {
    var min = arr[0]
    for (i in 0..<arr.size) {
        if (min > arr[i]) min = arr[i]
    }
    return min
}

///34//
fun countSmall(arr: Array<String>, number: Int): Int {
    var count = 0
    for (i in 0..<arr.size) {
        if (arr[i].length <= number) count += 1
    }
    return count
}


///5//


fun pow2(n: Int): Int {
    var result = 1
    for (i in 1..n) {
        result *= 2
    }
    return result
}

///6//

fun pow(base: Int, exponent: Int): Int {
    var result = 1
    for (i in 1..exponent) {
        result *= base
    }
    return result
}

//7//

fun isPowerOf2(n: Int): Boolean {
    if (n == 0) return false
    var cut = n
    while (cut > 1) {
        if (cut % 2 != 0) return false
        cut /= 2
    }
    return true
}

//8//

fun isPowerOf(base: Int, n: Int): Boolean {
    if (n == 0) return false
    if (n == 1) return true
    var cut = base
    while (cut < n) {
        cut *= base
    }
    return cut == n
}

///9//

fun biggestPowerOf2(n: Int): Int {
    if (n == 1) return -1
    var base = 1
    while (base < n) {
        base *= 2
    }
    return base / 2
}

fun smallestPowerOf2(n: Int): Int {
    if (n == 1) return -1
    var base = 1
    while (base < n) {
        base *= 2
    }
    return base
}

///13//

fun isBinDigit(c: Char) = '0' == c || '1' == c

///14//

fun isOctDigit(c: Char) = c in '0'..'7'

///20//
fun toOctDigit(c: Int) =
    when (c) {
        0 -> '0'
        1 -> '1'
        2 -> '2'
        3 -> '3'
        4 -> '4'
        5 -> '5'
        6 -> '6'
        7 -> '7'
        else -> 'x'
    }

///19//
fun fromOctDigit(c: Char) =
    when (c) {
        '0' -> 0
        '1' -> 1
        '2' -> 2
        '3' -> 3
        '4' -> 4
        '5' -> 5
        '6' -> 6
        '7' -> 7
        else -> -1
    }

//18//
fun fromBinDigit(c: Char) =
    when (c) {
        '0' -> 0
        '1' -> 1
        else -> -1
    }


//17//
fun toBinDigit(c: Int) =
    when (c) {
        0 -> '0'
        1 -> '1'
        else -> 'x'
    }

//15//
fun isHexDigit(c: Char) = c in '0'..'9' || c in 'A'..'F'

//16//
fun isHexDigitAll(c: Char) = c in '0'..'9' || c in 'A'..'F' || c in 'a'..'f'


//21//
fun fromHexDigit(c: Char): Int {
    if (c in '0'..'9') return c.code - 48
    if (c in 'A'..'F') return c.code - 65 + 10
    else return -1
}

//22//
fun fromHexDigitAll(c: Char): Int {
    if (c in '0'..'9') return c.code - 48
    if (c in 'A'..'F') return c.code - 65 + 10
    if (c in 'a'..'f') return c.code - 97 + 10
    else return -1
}

//23//
fun toHexDigit(c: Int) =
    when (c) {
        0 -> '0'
        1 -> '1'
        2 -> '2'
        3 -> '3'
        4 -> '4'
        5 -> '5'
        6 -> '6'
        7 -> '7'
        8 -> '8'
        9 -> '9'
        10 -> 'A'
        11 -> 'B'
        12 -> 'C'
        13 -> 'D'
        14 -> 'E'
        15 -> 'F'
        else -> '-'
    }

//25//
fun decimal2octal(n: Int): String {
    var dec = n
    if (dec < 8) return "$dec"
    var res = ""
    while (dec > 0) {
        val digit = dec % 8
        dec /= 8
        res = "$digit" + res
    }
    return res
}

//26//
fun decimal2hex(n: Int): String {
    var dec = n
    var res = ""
    while (dec > 0) {
        val digit = dec % 16
        val digitChar = toHexDigit(digit)
        dec /= 16
        res = "$digitChar" + res
    }
    return res
}

// c.code - 65 + 10


//11//
fun gcd(n1: Int, n2: Int): Int {
    var div = 1
    for (x in 2..min(n1, n2)) {
        if (n1 % x == 0 && n2 % x == 0)
            div = x
    }
    return div
}

//27//
fun binary2decimal2(n: String): Int {
    var res = 0
    for (i in 0..<n.length) {
        if (n[i] == '1') {
            val exp = n.length - 1 - i
            val s = pow2(exp)
            res += s
        }
    }
    return res
}

//27//
fun binary2decimal(n: String): Int {
    var res = 0
    for (i in 0..<n.length) {
        val digit = fromBinDigit(n[i])
        val exp = n.length - 1 - i
        val s = pow2(exp)
        res += s * digit

    }
    return res
}

//28//

fun octal2decimal(n: String): Int {
    var res = 0
    for (i in 0..<n.length) {
        val digit = fromOctDigit(n[i])
        val exp = n.length - 1 - i
        val s = pow(8,exp)
        res += s * digit

    }
    return res
}

//28* //

fun hex2decimal(n: String): Int {
    var res = 0
    for (i in 0..<n.length) {
        val digit = fromHexDigit(n[i])
        val exp = n.length - 1 - i
        val s = pow(16,exp)
        res += s * digit

    }
    return res
}



fun main() {
    println(countZeros(arrayOf(2, 0, 3, 0)))
    println(countZeros(arrayOf(0, 0, 0, 0)))
    println(countZeros(arrayOf(0, 0, 0, 0, 0, 4)))
    println(count(arrayOf(2, 2, 2, 0), 2))
    println(count(arrayOf(2, 0, 3, 0), 3))
    println(maximum(arrayOf(2, 0, 3, 1)))
    println(maximum(arrayOf(5, 6, 9, 4)))
    println(minimum(arrayOf(2, 0, 3, 1)))
    println(minimum(arrayOf(5, 6, 9, 4)))
    println(countSmall(arrayOf("dishes", "fire", "beautiful", "wife", "apple", "affordable"), 7))
    println(countSmall(arrayOf("hi", "buy", "good", "yes", "no", "affordable"), 2))
    println("Practice 4")
    println(pow2(5))
    println(pow2(2))
    println(pow2(1))
    println(pow2(0))
    println(pow(5, 2))
    println(pow(2, 5))
    println(pow(1, 6))
    println(pow(9, 3))
    println("Practice 7")
    println(isPowerOf2(16))
    println(isPowerOf2(15))
    println(isPowerOf2(1))
    println(isPowerOf2(18))
    println("Practice 8")
    println(isPowerOf(3, 81))
    println(isPowerOf(3, 15))
    println(isPowerOf(3, 1))
    println(isPowerOf(3, 27))
    println(isPowerOf(4, 64))
    println(isPowerOf(3, 55))
    println(isPowerOf(5, 625))
    println(isPowerOf(2, 8))
    println(isPowerOf(2, 10))
    println("Practice 9")
    println(biggestPowerOf2(156))
    println(biggestPowerOf2(15))
    println(biggestPowerOf2(65))
    println(biggestPowerOf2(33))
    println(biggestPowerOf2(1))
    println(smallestPowerOf2(156))
    println(smallestPowerOf2(15))
    println(smallestPowerOf2(65))
    println(smallestPowerOf2(33))
    println(smallestPowerOf2(1))
    println(smallestPowerOf2(1))
    println(isBinDigit('0'))
    println(isBinDigit('1'))
    println(isBinDigit('7'))
    println(isOctDigit('0'))
    println(isOctDigit('1'))
    println(isOctDigit('7'))
    println(isOctDigit('8'))
    println(isOctDigit('9'))
    println("Practice 20")
    println(toOctDigit(9))
    println(toOctDigit(1))
    println(toOctDigit(0))
    println(toOctDigit(7))
    println(toOctDigit(8))
    println(fromOctDigit('9'))
    println(fromOctDigit('1'))
    println(fromOctDigit('0'))
    println(fromOctDigit('7'))
    println(fromOctDigit('8'))
    println(fromBinDigit('1'))
    println(fromBinDigit('0'))
    println(fromBinDigit('6'))
    println(toBinDigit(1))
    println(toBinDigit(0))
    println(toBinDigit(5))
    println("Practice 15")
    println(isHexDigit('5'))
    println(isHexDigit('A'))
    println(isHexDigit('L'))
    println(isHexDigit('9'))
    println(isHexDigit('S'))
    println(isHexDigit('F'))
    println("Practice 16")
    println(isHexDigitAll('5'))
    println(isHexDigitAll('A'))
    println(isHexDigitAll('l'))
    println(isHexDigitAll('9'))
    println(isHexDigitAll('S'))
    println(isHexDigitAll('s'))
    println(isHexDigitAll('F'))
    println(isHexDigitAll('f'))
    println(isHexDigitAll('b'))
    println(fromHexDigit('2'))
    println(fromHexDigit('D'))
    println(fromHexDigit('b'))
    println(fromHexDigit('Z'))
    println(fromHexDigit('B'))
    println(fromHexDigitAll('2'))
    println(fromHexDigitAll('D'))
    println(fromHexDigitAll('b'))
    println(fromHexDigitAll('Z'))
    println(fromHexDigitAll('B'))
    println(fromHexDigitAll('a'))
    println(toHexDigit(9))
    println(toHexDigit(1))
    println(toHexDigit(14))
    println(toHexDigit(18))
    println(toHexDigit(10))
    println("Practice 25")
    println(decimal2octal(5))
    println(decimal2octal(8))
    println(decimal2octal(4))
    println(decimal2octal(7))
    println(decimal2octal(16))
    println(decimal2octal(19))
    println("Practice 26")
    println(decimal2hex(5))
    println(decimal2hex(16))
    println(decimal2hex(13))
    println(decimal2hex(255))
    println(decimal2hex(19))
    println("Practice 11")
    println(gcd(12, 15))
    println(gcd(28, 17))
    println("Practice 27")
    println(binary2decimal("1011"))
    println(binary2decimal("1101"))
    println(octal2decimal("20"))
    println(octal2decimal("21"))
    println(octal2decimal("67"))
    println(hex2decimal("67"))


}




