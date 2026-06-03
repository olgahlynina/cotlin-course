package ru.stimmax.lessons.lesson19.homeworks

//1)Напиши функцию getMiddleElement с дженериком, которая будет принимать список и возвращать средний элемент, если он существует, иначе возвращать null.
// Например, у списка из четырёх элементов - среднего элемента нет.
fun <G> getMiddleElement(list: List<G>): G? {
    if (list.isEmpty() || list.size % 2 == 0) {
        return null
    }
    val middleIndex = list.size / 2
    return list[middleIndex]
}

