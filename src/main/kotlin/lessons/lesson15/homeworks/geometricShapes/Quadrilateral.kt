package lessons.lesson15.homeworks.geometricShapes

class Quadrilateral(
    val view: String,
    val sideA: Double,
    val sideB: Double
) : Polygon(type = "Плоская фигура", shape = "Четырехугольник", sidesCount = 4) {

    fun calculateRectangleArea(): Double {
        return sideA * sideB
    }
}