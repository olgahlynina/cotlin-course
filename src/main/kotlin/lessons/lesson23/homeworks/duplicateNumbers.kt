package ru.stimmax.lessons.lesson23.homeworks

//3)Создай функцию-расширение списка чисел, которая будет возвращать множество дубликатов чисел (встречающихся в списке более одного раза).
//-Создай аналогичную анонимную функцию.
//-Создай аналогичное лямбда выражение с указанием типа.
//-Проверь, что лямбда выражение работает правильно с помощью нескольких наборов данных.

fun List<Int>.duplicateNumbers(): Set<Int> {
    return this.groupBy { it }
        .filter { it.value.size > 1 }
        .keys
}

val duplicateNumbersAnon = fun List<Int>.(): Set<Int> {
    return this.groupBy { it }
        .filter { it.value.size > 1 }
        .keys
}

val duplicateNumbersLambda: List<Int>.() -> Set<Int> = {
    this.groupBy { it }
        .filter { it.value.size > 1 }
        .keys
}