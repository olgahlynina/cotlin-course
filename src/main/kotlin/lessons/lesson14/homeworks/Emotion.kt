package ru.stimmax.lessons.lesson14.homeworks

// 2)Аспект реальности: эмоция. Создайте класс Emotion, который представляет эмоцию. У него должно быть свойство type (String) и intensity (Int). Добавьте метод express(), который выводит описание эмоции в зависимости от её типа и интенсивности.
class Emotion(val type: String, val intensity: Int) {
    fun express() {
        val description = when {
            intensity <= 2 -> "слабая"
            intensity <= 6 -> "умеренная"
            else -> "сильная"
        }
        println("$description эмоция: $type")
    }
}