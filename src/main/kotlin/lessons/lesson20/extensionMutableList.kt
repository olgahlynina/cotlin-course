package ru.stimmax.lessons.lesson20

//2)Создайте функцию-расширение для изменяемого списка элементов:
//-с дженериком T ограниченным интерфейсом Comparable<T>
//-которая принимает булево значение
//-возвращает этот же список только в виде неизменяемого
//-сам изменяемый список при этом должен стать отсортированным по возрастанию,
//если в функцию передано true и по убыванию, если false (используем функции sort() и sortDescending()

fun <T : Comparable<T>> MutableList<T>.extensionMutableList(ascending: Boolean): List<T> {
    if (ascending) sort() else sortDescending()
    return toList()
}

