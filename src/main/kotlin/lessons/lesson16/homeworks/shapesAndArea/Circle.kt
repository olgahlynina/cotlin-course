package ru.stimmax.lessons.lesson16.homeworks.shapesAndArea

class Circle(private val radius: Double) : Shape() {
    override fun area(): Double {
        return Math.PI * radius * radius
    }
}