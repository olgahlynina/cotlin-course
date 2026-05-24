package lessons.lesson15.homeworks.furniture

class Wardrobe(
    name: String,
    subspecies: String,
    material: String,
    val doorsCount: Int
) : CaseFurniture(name, subspecies, material) {

    fun checkCapacity() {
        println("Шкаф $name имеет $doorsCount дв. — вместит много одежды!")
    }
}