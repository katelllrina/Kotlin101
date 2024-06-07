/*
Example datetime:
  "2024-05-29 18:33:41"

Example result:
  "May 29th, 2024, 18:33:41, Evening"

Day: 28
Month: 05 or May
Year: 2024
Date: day + month + year (example: "2024-05-28" or "May 28th, 2024" or "28 May 2024" or "05/29/2024")
Time: 18:33:41
Datetime: date + time
Daytime: Evening

Input:
  2024-05-29 18:33:41
  |        | |      |
  |--------| |------|
     date      time

Steps:
+ 1. Convert month number to month string
+ 2. Convert month day to suffixed day
+ 3. Form date from month string, suffixed day and year
+ 4. Add time to string formed on step 3
+ 5. Guess time of day from time
  6. Produce final string
*/

fun showMonth(month: Int): String =
    when (month) {
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

fun showDay(day: Int): String {
    val suffix = when (day) {
        1, 21, 31 -> "st"
        2, 22 -> "nd"
        3, 23 -> "rd"
        else -> "th"
    }
    return "$day$suffix"
}

fun showDaytime(hour: Int): String =
    when (hour) {
        in 6..11 -> "Morning"
        in 12..18 -> "Afternoon"
        in 19..21 -> "Evening"
        in 22..23, in 0..5 -> "Night"
        else -> "unknown"
    }

fun showAll(year: Int, month: Int, day: Int): String {
    val monthString = showMonth(month)
    val dayString = showDay(day)
    return "$monthString $dayString, $year"
}

fun charToInt(c: Char): Int =
    c.code - 48

// Example: stringToInt("2024") = 2024
fun stringToInt(s: String): Int =
    when (s.length) {
        2 -> numberFromTwoDigits(charToInt(s[0]), charToInt(s[1]))
        4 -> numberFromFourDigits(charToInt(s[0]), charToInt(s[1]), charToInt(s[2]), charToInt(s[3]))
        else -> -1
    }

// Example: showTime("18:33:41") = "18:33:41, Evening"
fun showTime(time: String): String {
    val hourString = time.substring(0..1)
    val hour = stringToInt(hourString)
    val daytime = showDaytime(hour)
    return "$time, $daytime"
}

// Example: showDate("2024-05-31") = "May 31st, 2024"
fun showDate(date: String): String {
    val yearString = date.substring(0..3)
    val monthString = date.substring(5..6)
    val dayString = date.substring(8..9)
    val year = stringToInt(yearString)
    val month = stringToInt(monthString)
    val day = stringToInt(dayString)
    return showAll(year, month, day)
}

// Example: showDatetime("2024-05-29 18:33:41") = "May 29th, 2024, 18:33:41, Evening"
fun showDatetime(datetime: String): String {
    val dateString = datetime.substring(0..9)
    val date = showDate(dateString)
    val timeString = datetime.substring(11..18)
    val time = showTime(timeString)
    return "$date, $time"
}

fun main() {
    // Tests for showMonth
    for (i in 1..12) {
        println(showMonth(i))
    }

    for (i in 1..31) {
        println(showDay(i))
    }

    /* println(showAll(2024, 2,5 ))
     println(showAll(2024, 12,27 ))
     println(stringToInt("2035")) */

    println(showTime("18:23:34"))
    println(showDatetime("2024-06-18 13:30:00"))
}