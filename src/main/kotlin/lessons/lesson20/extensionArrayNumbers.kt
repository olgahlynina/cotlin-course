package ru.stimmax.lessons.lesson20

//1)Определите функцию-расширение для массива чисел, которая не принимает аргументов и возвращает пару из чисел - первое и последнее.
// Если массив был пуст, то вернуть пару из null значений.
fun Array<Int>.extensionArrayNumbers(): Pair<Int?, Int?> =
    if (isEmpty()) Pair(null, null) else Pair(first(), last())