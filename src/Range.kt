fun main() {
    print("Введите ваш уровень: ")
    val level = readln().toInt()
    if (level in 1..50) {
        print("Уровень $level соответствуте требованиям! Вы можете зайти в данж!")
    }
    else {
        println("Высокий уровень! Вход запрещён!")
    }
    val a = 'z' downTo 'a'
    val b = 5 until 10
    val c = 10..50 step 3
    println(a)
    println(b)
    println(c)
}