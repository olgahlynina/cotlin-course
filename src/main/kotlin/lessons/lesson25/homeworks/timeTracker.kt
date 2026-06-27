package ru.stimmax.lessons.lesson25.homeworks

// Задание 1: Функция высшего порядка
fun timeTracker(block: () -> Unit): Long {
    val startTime = System.currentTimeMillis()
    block()
    val endTime = System.currentTimeMillis()
    return endTime - startTime
}