fun printTableNot() {
    println("Truth table for unary negation")
    println("----------")
    println("| x | !x |")

    // declare new variable
    val x = false
    println("----------")
    println("| $x | ${!x} |") // string interpolation

    val x2 = true
    println("----------")
    println("| $x2 | ${!x2} |")
    println("----------")

    println("Truth table for binary: and")
    println("------------------")
    println("| x | y | x && y |")
    println("------------------")}

fun printTableAnd() {
    val res00 = false && false  // logical and
    println("| 0 | 0 | $res00 |")
    println("------------------")
    val res01 = false && true
    println("| 0 | 1 | $res01 |")
    println("------------------")
    val res10 = true && false
    println("| 1 | 0 | $res10 |")
    println("------------------")
    val res11 = true && true
    println("| 1 | 1 | $res11 |")
    println("------------------")
}

fun printTableOr() {
    println("Truth table for binary: or")
    println("------------------")
    println("| x | y | x || y |")
    println("------------------")

    val res00 = false || false  // logical or
    println("| 0 | 0 | $res00 |")
    println("------------------")
    val res01 = false || true
    println("| 0 | 1 | $res01 |")
    println("------------------")
    val res10 = true || false
    println("| 1 | 0 | $res10 |")
    println("------------------")
    val res11 = true || true
    println("| 1 | 1 | $res11 |")
    println("------------------")
}


fun xor(x: Boolean, y: Boolean): Boolean {
    // if (boolean expression) { <result_1 if true> } else { <result_1 if false> }

//    // 1. Most verbose
//    if (x == true) {
//        if (y == true) {
//            return false
//        } else {
//            return true
//        }
//    } else { // x == false
//        if (y == true) {
//            return true
//        } else {
//            return false
//        }
//    }

//    // 2. One return
//    return if (x == true) {
//        if (y == true) {
//            false
//        } else {
//            true
//        }
//    } else { // x == false
//        if (y == true) {
//             true
//        } else {
//             false
//        }
//    }

//    // 3. One return with variable
//    val result = if (x == true) {
//        if (y == true) {
//            false
//        } else {
//            true
//        }
//    } else { // x == false
//        if (y == true) {
//            true
//        } else {
//            false
//        }
//    }
//    return result

//    // 4. Without == (see property 4.2)
//    val result = if (x) {
//        if (y) {
//            false
//        } else {
//            true
//        }
//    } else { // x == false
//        if (y) {
//            true
//        } else {
//            false
//        }
//    }
//    return result

    // 5. Simplify inner ifs
    val result = if (x) { !y } else { y }
    return result
}

// Int -- integer, number
// String -- "Hello, nyaaaa"
// Boolean -- true, false
fun add3(x: Int, y: Int, z: Int): Int {
    val result1 = x + y
    val result2 = result1 + z
    return result2
}

// max(3, 7) = 7
fun max(x: Int, y: Int): Int {
//    if (x > y) {
//        return x
//    } else {
//        return y
//    }

//    val biggest = if (x > y) { x } else { y }
//    return biggest

    return if (x > y) { x } else { y }
    // return 3 + 4
}

fun printTableXor() {
    println("Truth table for binary: Xor")
    println("------------------")
    println("| x | y | x xor y |")
    println("------------------")

    val res00 = xor(false, false)  // logical xor
    println("| 0 | 0 | $res00 |")
    println("------------------")
    val res01 = xor(false, true)
    println("| 0 | 1 | $res01 |")
    println("------------------")
    val res10 = xor (true, false)
    println("| 1 | 0 | $res10 |")
    println("------------------")
    val res11 = xor (true,true)
    println("| 1 | 1 | $res11 |")
    println("------------------")
}

fun printTableEq() {
    println("Truth table for binary: ==")
    println("------------------")
    println("| x | y | x == y |")
    println("------------------")
    val res00 = false == false  // logical and
    println("| 0 | 0 | $res00 |")
    println("------------------")
    val res01 = false == true
    println("| 0 | 1 | $res01 |")
    println("------------------")
    val res10 = true == false
    println("| 1 | 0 | $res10 |")
    println("------------------")
    val res11 = true == true
    println("| 1 | 1 | $res11 |")
    println("------------------")
}

fun imp(x: Boolean, y: Boolean): Boolean {
    val result = if (x) {y} else {true}
    return result
}

fun printTableImp() {
    println("Truth table for binary: =>")
    println("------------------")
    println("| x | y | x => y |")
    println("------------------")

    val res00 = imp(false, false)  // logical xor
    println("| 0 | 0 | $res00 |")
    println("------------------")
    val res01 = imp(false, true)
    println("| 0 | 1 | $res01 |")
    println("------------------")
    val res10 = imp(true, false)
    println("| 1 | 0 | $res10 |")
    println("------------------")
    val res11 = imp(true,true)
    println("| 1 | 1 | $res11 |")
    println("------------------")
}

fun booleanMain() {
//    printTableNot()
//    printTableAnd()
//    printTableOr()
    // test
    // println(add3(4, 7,10))
    // println(max(7, 10))
    // tables
    // printTableXor()
    // printTableEq()
    printTableImp()
    printTableImp()
}

// Summary:
// fun
// val
// if-else
// main()
// println
// Int, String, Boolean
// return
// string interpolation
// comments: // and /* */
// &&, ||, ==, +, >
// true, false
// 2 hours, 240 LOC