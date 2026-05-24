package ru.stimmax.lessons.lesson15.homeworks.materials

import lessons.lesson15.homeworks.materials.Materials

//7)Четвёртый класс должен принимать словарь (ключи и значения строки). Каждая пара ключа и значения должна попадать в контейнер следующим образом - ключ в начало, значение в конец. Таким образом в начале должны быть ключи в обратном порядке, потом существующие материалы, потом все значения.
class MapInsert : Materials() {
    fun addMaterialsFromMap(map: Map<String, String>) {
        val existingMaterials = extractMaterials()
        val reversedKeys = map.keys.reversed()
        val values = map.values
        val finalResult = reversedKeys + existingMaterials + values

        finalResult.forEach { addMaterial(it) }
    }
}