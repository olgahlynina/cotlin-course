package ru.stimmax.lessons.lesson16.homeworks.logger

import ru.stimmax.lessons.lesson16.homeworks.animalsAndSound.Colors
import ru.stimmax.lessons.lesson16.homeworks.animalsAndSound.printColored
import ru.stimmax.lessons.lesson16.homeworks.printer.Background

class Logger {

    fun log(message: String) {
        println("[INFO] $message")
    }

    fun log(level: LogLevel, message: String) {
        val prefix = "[$level]"
        val fullMessage = "$prefix $message"

        when (level) {
            LogLevel.WARNING -> {
                printColored(fullMessage, Colors.YELLOW)
            }
            LogLevel.ERROR -> {
                printColored(fullMessage, Colors.WHITE, Background.RED)
            }
            LogLevel.INFO -> {
                log(message)
            }
            LogLevel.DEBUG -> {
                printColored(fullMessage, Colors.BLUE)
            }
        }
    }

    fun log(messages: List<String>) {
        for (msg in messages) {
            log(msg)
        }
    }

    fun log(exception: Exception) {
        val message = exception.message ?: exception.javaClass.simpleName
        log(LogLevel.ERROR, message)
    }
}