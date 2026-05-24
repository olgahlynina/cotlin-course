package ru.stimmax.lessons.lesson16.homeworks.printer

import ru.stimmax.lessons.lesson16.homeworks.animalsAndSound.printColored

class LaserPrinter : Printer() {
    override fun print(text: String) {
        val words = text.split(" ")
        for (word in words) {
            if (word.isNotEmpty()) {
                printColored(word, Colors.BLACK, Background.WHITE)
            }
        }
    }
}