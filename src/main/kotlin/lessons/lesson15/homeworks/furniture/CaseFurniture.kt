package lessons.lesson15.homeworks.furniture

open class CaseFurniture(
    name: String,
    subspecies: String,
    val material: String
) : Furniture(name, subspecies) {

    fun assemblyRequired() {
        println("$name из материала $material требует сборки по инструкции.")
    }
}