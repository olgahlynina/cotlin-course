package lessons.lesson15.homeworks.geometricShapes

class Circle(
    val radius: Double
) : GeometricShape(type = "Плоская фигура", shape = "Круг") {

    fun calculateDiameter(): Double {
        return radius * 2
    }
}