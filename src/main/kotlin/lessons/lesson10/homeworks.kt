package ru.stimmax.lessons.lesson10

import kotlin.div

fun main() {

    // Задачи на работу со словарём

    // 1)Создайте пустой неизменяемый словарь, где ключи и значения - целые числа.
    val a1 = mapOf<Int, Int>()

    // 2)Создайте словарь, инициализированный несколькими парами "ключ-значение", где ключи - float, а значения - double
    val a2 = mapOf<Float, Double>(1.2f to 12.5, 3.5f to 45.7, 2.0f to 85.5)

    // 3)Создайте изменяемый словарь, где ключи - целые числа, а значения - строки.
    val a3 = mutableMapOf<Int, String>()

    // 4)Имея изменяемый словарь, добавьте в него новые пары "ключ-значение".
    val a4 = mutableMapOf<Int, String>(1 to "a", 2 to "b", 3 to "c")
    a4[4] = "d"
    a4[5] = "e"

    // 5)Используя словарь из предыдущего задания, извлеките значение, используя ключ. Попробуй получить значение с ключом, которого в словаре нет.
    val a5 = a4[1]
    val a6 = a4[10]
    println(a6)

    // 6)Удалите определенный элемент из изменяемого словаря по его ключу.
    val a7 = mutableMapOf<String, String>("город" to "Брянск", "занятие" to "Kotlin", "стресс" to "есть")
    a7.remove("стресс")
    println(a7)

    // вызов функции задания 7
    divisionResult()

    // 8)Измените значение для существующего ключа в изменяемом словаре.
    val a9 = mutableMapOf<Int, String>(1 to "a", 2 to "b", 3 to "c")
    a9[3] = "nxfgjfg"
    println(a9)

    // 9)Создайте два словаря и объедините их в третьем изменяемом словаре через циклы.
    val a10 = mapOf<Int, String>(1 to "a", 2 to "b", 3 to "c")
    val a11 = mapOf<Int, String>(4 to "d", 5 to "i")
    val a12 = mutableMapOf<Int, String>()

    for ((key, value) in a10) {
        a12[key] = value
    }

    for ((key, value) in a11) {
        a12[key] = value
    }
    println(a12)

    // 10)Создайте словарь, где ключами являются строки, а значениями - списки целых чисел. Добавьте несколько элементов в этот словарь.
    val a13 = mutableMapOf<String, List<Int>>()
    a13["art"] = listOf(1, 2, 3)
    a13["rad"] = listOf(4, 5, 6)
    println(a13)

    // 11)Создай словарь, в котором ключи - это целые числа, а значения - изменяемые множества строк. Добавь данные в словарь. Получи значение по ключу (это должно быть множество строк) и добавь в это множество ещё строку. Распечатай полученное множество.
    val a14 = mutableMapOf<Int, MutableSet<String>>()
    a14[1] = mutableSetOf("Kotlin", "Java", "Python")
    a14[2] = mutableSetOf("Android", "iOS", "Web")
    a14[3] = mutableSetOf("Функциональное", "ООП", "Процедурное")
    val setOfStrings = a14[1]
    setOfStrings?.add("Kotlin is fun")
    println("Множество по ключу 1: $setOfStrings")

    // 12)Создай словарь, где ключами будут пары чисел. Через перебор найди значение у которого пара будет содержать цифру 5 в качестве первого или второго значения.
    val a15 = mutableMapOf<Pair<Int, Int>, String>()
    a15[Pair(1, 2)] = "марс"
    a15[Pair(3, 4)] = "венера"
    a15[Pair(5, 6)] = "сатурн"
    a15[Pair(7, 5)] = "юпитер"
    a15[Pair(2, 5)] = "нептун"

    println("Поиск значений, у которых пара содержит цифру 5:")
    println()

    for ((key, value) in a15) {
        if (key.first == 5 || key.second == 5) {
            println("Найдено: пара $key -> значение: $value")
        }
    }
}

// 7)Создайте словарь (ключи Double, значения Int) и выведи в цикле результат деления ключа на значение. Не забудь обработать деление на 0 (в этом случае выведи слово “бесконечность”)
fun divisionResult() {
    val a8 = mapOf<Double, Int>(8.8 to 2, 4.4 to 2, 2.2 to 0)

    for ((key, value) in a8) {
        if (value != 0) {
            val result = key / value
            println("$key / $value = $result")
        } else {
            println("$key / ${0} = бесконечность")
        }
    }


    // Задачи на подбор оптимального типа для словаря

    // 1) Словарь библиотека: Ключи - автор книги, значения - список книг
    val library = mutableMapOf<String, MutableList<String>>()

    // 2) Справочник растений: Ключи - типы растений, значения - списки названий растений
    val guide = mutableMapOf<String, MutableList<String>>()

    // 3) Четвертьфинала: Ключи - названия спортивных команд, значения - списки игроков
    val quarterfinals = mutableMapOf<String, MutableList<String>>()

    // 4) Курс лечения: Ключи - даты, значения - список препаратов
    val treatmentCourse = mutableMapOf<String, MutableList<String>>()

    // 5) Словарь путешественника: Ключи - страны, значения - словари из городов со списком интересных мест
    val dictionary = mutableMapOf<String, MutableMap<String, MutableList<String>>>()
}






