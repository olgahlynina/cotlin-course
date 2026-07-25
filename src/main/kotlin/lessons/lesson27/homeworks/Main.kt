package ru.stimmax.lessons.lesson27.homeworks

fun main() {
    println("--- Задание 2: Сортировка недвижимости ---")
    printRealEstateTypesSorted()

    println("\n--- Задание 3: Статусы тестов ---")
    val statusSuccess = runTest { println("Тест выполняется успешно...") }
    val statusFailed = runTest { throw AssertionError("Wrong expected value") }
    val statusBroken = runTest { throw NullPointerException("Unexpected crash") }
    println("Результаты: $statusSuccess, $statusFailed, $statusBroken")

    println("\n--- Задание 4: Поиск планет ---")
    try {
        val heavyPlanet = findPlanet { it.mass > 300.0 }
        println("Тяжелая планета: $heavyPlanet (Масса: ${heavyPlanet.mass})")

        val farPlanet = findPlanet { it.distanceToSun > 40.0 }
        println(farPlanet)
    } catch (e: Exception) {
        println("Ошибка поиска: ${e.message}")
    }
}