package lessons.lesson15.homeworks.geometricShapes

open class GeometricShape(
    val type: String,
    val shape: String
) {
    open fun draw() {
        println("Shape: $shape")
    }
}