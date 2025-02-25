package problems

/*
Given:
  - stick height
  - snail speed (cm per day the snail climbs)
  - snail decline (cm per night the snail slips down)
Need:
  - Number of days to climb the stick

Examples:
  countDays(10, 5, 2) = 3
 */
fun countDays(height: Int, speed: Int, decline: Int): Int {
    if (speed >= height) return 1
    if (speed <= decline) return -1
    var currentPosition = 0
    var day = 1
    while (true) {
        currentPosition += speed
        if (currentPosition >= height) return day
        day += 1
        currentPosition -= decline
    }
}

fun main() {
    println(countDays(10, 5, 2))
    println(countDays(5, 5, 2))
    println(countDays(7, 3, 4))
    println(countDays(27, 27, 27))
}