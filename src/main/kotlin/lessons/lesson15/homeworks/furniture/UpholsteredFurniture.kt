package lessons.lesson15.homeworks.furniture

open class UpholsteredFurniture(
    name: String,
    subspecies: String,
    val upholsteryMaterial: String
) : Furniture(name, subspecies) {

    fun cleanUpholstery() {
        println("Рекомендуется бережная чистка для материала: $upholsteryMaterial")
    }
}