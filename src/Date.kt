/*
Example datetime:
  "2024-05-29 18:33:41"

Example result:
  "May 29th, 2024, 18:33:41, Evening"
 */

fun showMonth(month: Int): String {
    val result = when (month) {
        1 -> "January"
        2 -> "February"
        3 -> "March"
        4 -> "April"
        5 -> "May"
        6 -> "June"
        7 -> "July"
        8 -> "August"
        9 -> "September"
        10 -> "October"
        11 -> "November"
        12 -> "December"
        else -> "Unknown"
    }
    return result
}

fun main() {
    // Tests for showMonth
    for (i in 1..12) {
        println(showMonth(i))
    }
}