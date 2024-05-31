/*
Example datetime:
  "2024-05-29 18:33:41"

Example result:
  "May 29th, 2024, 18:33:41, Evening"

Steps:
+ 1. Convert month number to month string
  2. Convert month day to suffixed day
  3. Form date from month string, suffixed day and year
  4. Add time to string formed on step 3
  5. Guess time of day from time
  6. Produce final string
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

fun showDay(day: Int): String {
    val suffix = when (day) {
        1, 21, 31 -> "st"
        2, 22 -> "nd"
        3, 23 -> "rd"
        else -> "th"
    }
    val result = "$day$suffix"
    return result
}

fun main() {
    // Tests for showMonth
    for (i in 1..12) {
        println(showMonth(i))
    }

    for (i in 1..31) {
        println(showDay(i))
    }
}