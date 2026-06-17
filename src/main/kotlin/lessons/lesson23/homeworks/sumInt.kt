package ru.stimmax.lessons.lesson23.homeworks

//2)Создай функцию, которая принимает большое число и возвращает сумму цифр этого числа. Сделай проверку, что входящее число больше нуля.
// Подсказка: для парсинга символа в число можно использовать функцию digitToInt()
//-Создай аналогичную анонимную функцию.
//Создай аналогичное лямбда выражение с указанием типа.
//Создай лямбда выражение без указания типа.
//Проверь, что лямбда выражение работает правильно с помощью нескольких наборов данных.

fun sumInt(number: Int): Int {
    require(number > 0) { "Число должно быть больше нуля" }
    return number.toString().sumOf { it.digitToInt() }
}

val sumInt1 = fun(number: Int): Int {
    require(number > 0) { "Число должно быть больше нуля" }
    return number.toString().sumOf { it.digitToInt() }
}

val sumInt2: (Int) -> Int = { number ->
    require(number > 0) { "Число должно быть больше нуля" }
    number.toString().sumOf { it.digitToInt() }
}

val sumInt3 = { number: Int ->
    require(number > 0) { "Число должно быть больше нуля" }
    number.toString().sumOf { it.digitToInt() }
}


