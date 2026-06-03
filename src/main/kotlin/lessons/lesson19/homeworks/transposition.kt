package ru.stimmax.lessons.lesson19.homeworks

//5)Создай функцию transposition с двумя дженериками, которая принимает словарь с дженериками
// и возвращает словарь, в котором ключ и значения поменялись местами.
fun <K, V> transposition(map: Map<K, V>): Map<V, K> {
    return map.entries.associate { it.value to it.key }
}