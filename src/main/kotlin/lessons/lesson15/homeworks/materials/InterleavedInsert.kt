package ru.stimmax.lessons.lesson15.homeworks.materials
import lessons.lesson15.homeworks.materials.Materials

// 5)Второй класс должен получать список строк и вставлять их в начало контейнера но поочерёдно с теми данными, которые уже есть. То-есть, наш список должен появиться в контейнере по индексам 0, 2, 4 и так далее.
class InterleavedInsert : Materials() {
    fun addMaterialsInterleaved(newMaterials: List<String>) {
        val existingMaterials = extractMaterials()
        val result = mutableListOf<String>()
        val maxSize = maxOf(newMaterials.size, existingMaterials.size)

        for (i in 0 until maxSize) {
            if (i < newMaterials.size) {
                result.add(newMaterials[i])
            }
            if (i < existingMaterials.size) {
                result.add(existingMaterials[i])
            }
        }

        result.forEach { addMaterial(it) }
    }
}