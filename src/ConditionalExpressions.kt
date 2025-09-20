fun main() {
    val age = readln().toInt()
    val status = if (age >= 18) "Взрослый" else "Ребёнок"
    println(status)
}
