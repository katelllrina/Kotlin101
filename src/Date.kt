/*
Example datetime:
  "2024-05-29 18:33:41"

Example result:
  "May 29th, 2024, 18:33:41, Evening"
 */

/*

fun, val, if-else, return - keywords / reserved words / language constructions

Two kinds of language constructions:
  1. Statements
  2. Expressions

Difference:
  1. Expressions are values that have types
     1: Int
     false, true: Boolean
     "Kate": String
     someVariable: someType (this is expression too!)
     xor: (Boolean, Boolean) -> Boolean
     if-else: if (<condition> : Boolean) { <expression_if_true> : t } else { <expression_if_false> : t } : t
       if ("January") -- WRONG !!!
       if (==) -- WRONG !!!
       if (1) -- WRONG !!!
       if (== 1) -- WRONG !!!
       if (xor(true, false)) -- OK !
       if (true) { "January" } else { 5 } -- WRONG !!!

  2. Statements: other
     val <name> = <expr : t>
        => <name: t> is expression
       val z = 8
       val x = z + 5
         => x: Int

     fun <name>(<args>): <return_type> { <body> }

     return <expr>

     for (<name> in <list>) { }
 */


fun showMonth(month: Int): String {
    val result = if (month == 1) {
        "January"
        /*
        val month = "January" - only this string is statement
        month - this string add for make expression
         */
    } else {
        if (month == 2) {
            "February"
        } else {
            if (month == 3) {
                "March"
            } else {
                if (month == 4) {
                    "April"
                } else {
                    if (month == 5) {
                        "May"
                    } else {
                        if (month == 6) {
                            "June"
                        } else {
                            if (month == 7) {
                                "July"
                            } else {
                                if (month == 8) {
                                    "August"
                                } else {
                                    if (month == 9) {
                                        "September"
                                    } else {
                                        if (month == 10) {
                                            "October"
                                        } else {
                                           if (month == 11) {
                                               "November"
                                           } else {
                                               "December"
                                           }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    return result
}

fun main() {
    // Tests for showMonth
    for (i in 1..12) {
        println(showMonth(i))
    }
}