/*
Example datetime:
  "2024-05-29 18:33:41"

Example result:
  "May 29th, 2024, 18:33:41, Evening"
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