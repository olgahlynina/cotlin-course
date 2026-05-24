package lessons.lesson15.homeworks.furniture

open class Furniture(
    val name: String,
    val subspecies: String,
) {
    fun printDescription() {
        println("Мебель: $name, Категория: $subspecies")
    }
}
