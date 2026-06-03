package ru.stimmax.lessons.lesson19.homeworks

//2)Напиши класс ListHolder, который будет хранить список элементов типа T и иметь метод для добавления нового элемента
// и получения всех элементов в виде неизменяемого списка.
class ListHolder<T>(initialElements: List<T> = emptyList()) {
    private val elements = initialElements.toMutableList()
    fun addElement(element: T) {
        elements.add(element)
    }
    fun getAllElements(): List<T> {
        return elements.toList()
    }
}