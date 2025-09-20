fun main() {
    println("Начинаем ритуал защиты!")
    repeat(times = 5) { index ->
        if (index == 2) {
            println("Пропускаем шаг ${index + 1} из-за магического вмешательства!")
            return@repeat
        }
        println("Заклинание защиты активировано! (Шаг ${index + 1})")
    }
    println("Замок защищен!")
}