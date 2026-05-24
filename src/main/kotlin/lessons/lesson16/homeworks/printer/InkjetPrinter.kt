package ru.stimmax.lessons.lesson16.homeworks.printer

import ru.stimmax.lessons.lesson16.homeworks.animalsAndSound.printColored

class InkjetPrinter : Printer() {

    private val colorPairs = listOf(
        Pair(Colors.RED, Background.YELLOW),
        Pair(Colors.GREEN, Background.BLACK),
        Pair(Colors.BLUE, Background.WHITE),
        Pair(Colors.YELLOW, Background.PURPLE),
        Pair(Colors.WHITE, Background.BLUE),
        Pair(Colors.BLACK, Background.CYAN),
        Pair(Colors.PURPLE, Background.GREEN),
        Pair(Colors.CYAN, Background.RED)
    )

    override fun print(text: String) {
        val words = text.split(" ")
        var colorIndex = 0

        for (word in words) {
            if (word.isNotEmpty()) {
                val (textColor, bgColor) = colorPairs[colorIndex]

                printColored(word, textColor, bgColor)

                colorIndex = (colorIndex + 1) % colorPairs.size
            }
        }
    }
}