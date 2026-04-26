package ru.stimmax.lessons.lesson08

fun main() {
    stringConversion("Это невозможно выполнить за один день")
    stringConversion("Я не уверен в успехе этого проекта")
    stringConversion("Произошла катастрофа на сервере")
    stringConversion("Этот код работает без проблем")
    stringConversion("Удача")
    extractingDate("Пользователь вошел в систему -> 2021-12-01 09:48:23")
    maskingPersonalData("4539 1488 0343 6467")
    emailFormatting("username@example.com")
    fileNameExtracting("C:/Пользователи/Документы/report.txt")
    abbreviationCreating("Котлин лучший язык программирования")
}

// 1. Преобразование строк
fun stringConversion(arg: String) {
    val result1 = when {
        arg.contains("невозможно") -> arg.replace("невозможно", "совершенно точно возможно, просто требует времени")
        arg.startsWith("Я не уверен") -> "$arg, но моя интуиция говорит об обратном"
        arg.contains("катастрофа") -> arg.replace("катастрофа", "интересное событие")
        arg.endsWith("без проблем") -> arg.replace("без проблем", "с парой интересных вызовов на пути")
        !arg.trim().contains(" ") -> "Иногда, $arg, но не всегда"
        else -> arg
    }
    println(result1)
}

// 2. Извлечение даты из строки лога
fun extractingDate(arg: String) {
    val (date, time) = arg.split(" -> ")[1].split(" ")
    println(date)
    println(time)
}

// 3. Маскирование личных данных
fun maskingPersonalData(arg: String) {
    val last4 = arg.takeLast(4)
    val masked = "**** **** **** $last4"
    println(masked)
}

// 4. Форматирование адреса электронной почты.
fun emailFormatting(arg: String) {
    val result2 = arg.replace("@", " [at] ").replace(".", " [dot] ")
    println(result2)
}

// 5. Извлечение имени файла из пути.
fun fileNameExtracting(arg: String) {
    val lastSlashIndex = arg.lastIndexOf("/")
    val result3 = arg.substring(lastSlashIndex + 1)
    println(result3)
}

// 6. Создание аббревиатуры из фразы.
fun abbreviationCreating(arg: String) {
    val words = arg.split(" ")
    var abbreviation = ""
    for (word in words) {
        if (word.isNotEmpty()) {
            abbreviation += word[0].uppercase()
        }
    }
    println(abbreviation)
}

