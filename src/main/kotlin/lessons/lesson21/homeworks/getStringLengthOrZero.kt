package ru.stimmax.lessons.lesson21.homeworks

//Задача 3
//Создайте функцию getStringLengthOrZero, которая принимает параметр типа Any? и возвращает длину строки, если аргумент можно привести к типу String.
//В случае, если аргумент равен null или не является строкой, функция должна возвращать 0.
fun getStringLengthOrZero(arg: Any?): Int = (arg as? String)?.length ?: 0