fun main() {
    print("Введите первое число: ")
    val number1 = readln().toInt()
    print("Введите второе число: ")
    val number2 = readln().toInt()

    if (number1 > number2) {
        println("Число $number1 больше чем число $number2")
    } else {
        println("Число $number2 больше чем число $number1")
    }
}