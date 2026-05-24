package lessons.lesson15.homeworks.furniture

class Table(
    name: String,
    subspecies: String,
    material: String,
    val isExtendable: Boolean
) : CaseFurniture(name, subspecies, material) {

    fun prepareForGuests() {
        if (isExtendable) {
            println("Стол $name раздвинут. Он готов к приёму гостей!")
        } else {
            println("Стол $name не раздвигается, но за ним всё равно уютно.")
        }
    }
}