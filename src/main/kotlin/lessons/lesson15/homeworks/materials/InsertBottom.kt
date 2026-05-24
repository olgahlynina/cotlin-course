package lessons.lesson15.homeworks.materials

// 4)Первый класс должен вставлять строку на дно контейнера (должно появиться под индексом 0)
class InsertBottom : Materials() {
    fun addMaterialToBottom(material: String) {
        val currentMaterials = extractMaterials()
        addMaterial(material)
        currentMaterials.forEach { addMaterial(it) }
    }
}