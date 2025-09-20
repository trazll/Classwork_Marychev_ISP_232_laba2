fun main() {
    print("Введите ваш урон: ")
    val a = readln().toInt()
    print("Щит активен? (введите да или нет): ")
    val shieldActive = readln()
    val c = if (shieldActive == "да") a / 2 else a
    print(c)
}
