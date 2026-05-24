package ru.stimmax.lessons.lesson16.homeworks.shapesAndArea

import kotlin.math.sin

class Triangle(private val sideA: Double, private val sideB: Double, private val angleDegrees: Double) : Shape() {
    override fun area(): Double {
        val angleRadians = Math.toRadians(angleDegrees)
        return 0.5 * sideA * sideB * sin(angleRadians)
    }
}