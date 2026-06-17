package ru.stimmax.lessons.lesson23.homeworks

//1)Создай функцию, которая принимает список чисел и возвращает среднее арифметическое всех чётных чисел этого списка.
// С помощью require проверь, что список не пустой.
//-Создай аналогичную анонимную функцию.
//-Создай аналогичное лямбда выражение с указанием типа.
//-Создай лямбда выражение без указания типа.
//-Проверь, что лямбда выражение работает правильно с помощью нескольких наборов данных (в том числе пустого).

fun averageEvenNumbers(list: List<Int>): Double {
    require(list.isNotEmpty()) { "Список не должен быть пустым" }
    val evenNumbers = list.filter { it % 2 == 0 }
    if (evenNumbers.isEmpty()) return 0.0
    return evenNumbers.average()
}

val averageEvenNumbers1 = fun(list: List<Int>): Double {
    require(list.isNotEmpty()) { "Список не должен быть пустым" }
    val evenNumbers = list.filter { it % 2 == 0 }
    if (evenNumbers.isEmpty()) return 0.0
    return evenNumbers.average()
}

val averageEvenNumbers2: (List<Int>) -> Double = { list ->
    require(list.isNotEmpty()) { "Список не должен быть пустым" }
    val evenNumbers = list.filter { it % 2 == 0 }
    if (evenNumbers.isEmpty()) 0.0 else evenNumbers.average()
}

val averageEvenNumbers3 = { list: List<Int> ->
    require(list.isNotEmpty()) { "Список не должен быть пустым" }
    val evenNumbers = list.filter { it % 2 == 0 }
    if (evenNumbers.isEmpty()) 0.0 else evenNumbers.average()
}






