fun main() {
    val daysInMonth = listOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
    println("Введите номер месяца (1-12): ")
    val input = readln().toInt()
    if (input in 1..12) {
        val days = daysInMonth[input - 1]
        println("В этом месяце $days дней.")
    } else {
        println("Некорректный номер месяца.")
    }
}

