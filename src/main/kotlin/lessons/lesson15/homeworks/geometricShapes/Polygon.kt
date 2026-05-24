package lessons.lesson15.homeworks.geometricShapes

open class Polygon(
    type: String,
    shape: String,
    val sidesCount: Int
) : GeometricShape(type, shape) {

    fun printAnglesCount() {
        println("У этого многоугольника $sidesCount углов.")
    }
}