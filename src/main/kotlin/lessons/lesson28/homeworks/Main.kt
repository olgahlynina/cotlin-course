package ru.stimmax.lessons.lesson28.homeworks

import java.time.*
import java.time.format.DateTimeFormatter
import java.time.temporal.Temporal

private val bFrom = LocalDate.of(1946, 1, 1)
private val bTo = LocalDate.of(1964, 12, 31)
private val zFrom = LocalDate.of(1997, 1, 1)
private val zTo = LocalDate.of(2012, 12, 31)

fun main() {
    val now = Instant.now().also { println(it) }
    val bday = LocalDate.of(1986, 10, 10)
    Period.between(bday, LocalDate.now()).years.also { println(it) }

    val d = LocalDate.of(2025, 4, 5)
    val t = LocalTime.of(15, 45, 12)
    val dt = LocalDateTime.of(d, t)

    listOf(d, t, dt,
        ZonedDateTime.of(d, t, ZoneId.of("Europe/Amsterdam")),
        OffsetDateTime.of(dt, ZoneOffset.of("+03:00"))).forEach { printFormatted(it) }

    listOf(d, t, dt,
        ZonedDateTime.of(d, t, ZoneId.of("Europe/Amsterdam")),
        OffsetDateTime.of(dt, ZoneOffset.of("+03:00"))).forEach { printISOFormatted(it) }

    listOf(bday, LocalDate.of(1955, 6, 15), LocalDate.of(2005, 3, 20)).forEach { it.identifyGeneration() }

    val fmt = DateTimeFormatter.ofPattern("dd MMMM")
    listOf(LocalDate.of(2023, 2, 25), LocalDate.of(2024, 2, 25))
        .map { it.plusDays(10).format(fmt) }
        .forEach { println(it) }
    println("2024 - високосный")
}

fun printFormatted(a: Temporal) {
    val p = when (a) {
        is LocalDate -> "dd-MM-yyyy"
        is LocalTime -> "HH:mm:ss"
        is LocalDateTime -> "dd-MM-yyyy HH:mm:ss"
        is ZonedDateTime -> "dd-MM-yyyy HH:mm:ss z"
        is OffsetDateTime -> "dd-MM-yyyy HH:mm:ss ZZZ"
        else -> throw IllegalArgumentException()
    }
    DateTimeFormatter.ofPattern(p).format(a).let { println(it) }
}

fun printISOFormatted(a: Temporal) {
    val f = when (a) {
        is LocalDate -> DateTimeFormatter.ISO_LOCAL_DATE
        is LocalTime -> DateTimeFormatter.ISO_LOCAL_TIME
        is LocalDateTime -> DateTimeFormatter.ISO_LOCAL_DATE_TIME
        is ZonedDateTime -> DateTimeFormatter.ISO_ZONED_DATE_TIME
        is OffsetDateTime -> DateTimeFormatter.ISO_OFFSET_DATE_TIME
        else -> throw IllegalArgumentException()
    }
    f.format(a).let { println(it) }
}

fun LocalDate.identifyGeneration() {
    when (this) {
        in bFrom..bTo -> println("Бумер")
        in zFrom..zTo -> println("Зумер")
        else -> println("Не определено")
    }
}