package ru.stimmax.lessons.lesson16.homeworks.shapesAndArea

class Square(private val side: Double) : Shape() {
    override fun area(): Double {
        return side * side
    }
}