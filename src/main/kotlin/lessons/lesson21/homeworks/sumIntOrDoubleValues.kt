package ru.stimmax.lessons.lesson21.homeworks

//Задача 5
//Напишите функцию sumIntOrDoubleValues, которая принимает список элементов типа Any и возвращает сумму всех целочисленных (Int)
//и вещественных (Double) значений в списке. Все остальные типы должны быть проигнорированы.

fun sumIntOrDoubleValues(list: List<Any>): Double = list.sumOf {
    when (it) {
        is Int -> it.toDouble()
        is Double -> it
        else -> 0.0
    }
}