package lessons.lesson15.homeworks.geometricShapes

class Triangle(
    val sideA: Double,
    val sideB: Double,
    val sideC: Double
) : Polygon(type = "Плоская фигура", shape = "Треугольник", sidesCount = 3) {

    fun calculatePerimeter(): Double {
        return sideA + sideB + sideC
    }
}