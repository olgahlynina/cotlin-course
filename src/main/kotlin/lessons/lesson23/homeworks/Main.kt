package ru.stimmax.lessons.lesson23.homeworks

fun main() {

    // Задание 1:

    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    println("Обычная функция: ${averageEvenNumbers(list)}")
    println("Анонимная функция: ${averageEvenNumbers1(list)}")
    println("Лямбда с типом: ${averageEvenNumbers2(list)}")
    println("Лямбда без типа: ${averageEvenNumbers3(list)}")

    val noEvenList = listOf(1, 3, 5)
    println("Список без чётных: ${averageEvenNumbers3(noEvenList)}")

    try {
        averageEvenNumbers3(emptyList())
    } catch (e: IllegalArgumentException) {
        println("Ошибка: ${e.message}")
    }

    //Задание 2:

    val test1 = 12345
    val test2 = 909

    println("Обычная функция (sumInt): ${sumInt(test1)}")
    println("Анонимная функция (sumInt1): ${sumInt1(test1)}")
    println("Лямбда с типом (sumInt2): ${sumInt2(test2)}")
    println("Лямбда без типа (sumInt3): ${sumInt3(test2)}")

    try {
        sumInt3(-5)
    } catch (e: IllegalArgumentException) {
        println("Ошибка: ${e.message}")
    }

    //Задание 3:

    val numbers = listOf(1, 2, 2, 3, 4, 4, 4)
    println(numbers.duplicateNumbersLambda())

    val unique = listOf(1, 2, 3)
    println(unique.duplicateNumbersLambda())

    val empty = emptyList<Int>()
    println(empty.duplicateNumbersLambda())
}

