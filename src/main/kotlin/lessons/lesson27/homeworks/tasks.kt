package ru.stimmax.lessons.lesson27.homeworks

// 1. Статусы прохождения теста
enum class Statuses {
    PASSED,
    BROKEN,
    FAILED,
    ;
}

// 2. Типы жилой недвижимости с названиями
enum class RealEstateType(val readableName: String) {
    APARTMENT("Квартира"),
    HOUSE("Дом"),
    STUDIO("Студия"),
    ROOM("Комната"),
    ;
}

// 3. Планеты с расстоянием до Солнца (а.е.) и массой (в массах Земли)
enum class Planet(val distanceToSun: Double, val mass: Double) {
    MERCURY(0.39, 0.055),
    VENUS(0.72, 0.815),
    EARTH(1.0, 1.0),
    MARS(1.52, 0.107),
    JUPITER(5.20, 317.8),
    ;
}

// Задание 2
fun printRealEstateTypesSorted() {
    RealEstateType.entries
        .sortedBy { it.name.length }
        .forEach { println(it.readableName) }
}

// Задание 3
fun runTest(block: () -> Unit): Statuses {
    return try {
        block()
        Statuses.PASSED
    } catch (e: AssertionError) {
        Statuses.FAILED
    } catch (e: Exception) {
        Statuses.BROKEN
    }
}

// Задание 4
fun findPlanet(filter: (Planet) -> Boolean): Planet {
    return Planet.entries.firstOrNull(filter)
        ?: throw NoSuchElementException("Планета по заданному критерию не найдена!")
}