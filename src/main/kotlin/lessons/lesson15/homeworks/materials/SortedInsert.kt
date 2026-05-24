package ru.stimmax.lessons.lesson15.homeworks.materials
import lessons.lesson15.homeworks.materials.Materials

// 6) Третий класс при добавлении строки должен отсортировать весь список материалов в алфавитном порядке включая добавляемый материал
class SortedInsert : Materials() {
    fun addMaterialSorted(material: String) {
        val existingMaterials = extractMaterials().toMutableList()
        existingMaterials.add(material)

        val sortedList = existingMaterials.sorted()
        sortedList.forEach { addMaterial(it) }
    }
}