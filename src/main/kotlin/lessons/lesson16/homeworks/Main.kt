package ru.stimmax.lessons.lesson16.homeworks

import ru.stimmax.lessons.lesson16.homeworks.animalsAndSound.Animal
import ru.stimmax.lessons.lesson16.homeworks.animalsAndSound.Bird
import ru.stimmax.lessons.lesson16.homeworks.animalsAndSound.Cat
import ru.stimmax.lessons.lesson16.homeworks.animalsAndSound.Dog
import ru.stimmax.lessons.lesson16.homeworks.basketGoods.ShoppingCart
import ru.stimmax.lessons.lesson16.homeworks.logger.LogLevel
import ru.stimmax.lessons.lesson16.homeworks.logger.Logger
import ru.stimmax.lessons.lesson16.homeworks.printer.InkjetPrinter
import ru.stimmax.lessons.lesson16.homeworks.printer.LaserPrinter
import ru.stimmax.lessons.lesson16.homeworks.printer.Printer

fun main() {
    val animals: List<Animal> = listOf(
        Dog(),
        Cat(),
        Bird()
    )

    for (animal in animals) {
        animal.makeSound()
    }

    val longText = "Кот залез на самую высокую ветку дерева и громко мяукал пока его не сняли спасатели"

    val laser: Printer = LaserPrinter()
    laser.print(longText)
    
    val inkjet: Printer = InkjetPrinter()
    inkjet.print(longText)

    val cart = ShoppingCart()

    cart.addToCart("яблоко")
    cart.addToCart("банан")

    cart.addToCart("яблоко", 3)
    cart.addToCart("апельсин", 5)

    val itemIdsList = listOf("банан", "груша", "банан", "киви")
    cart.addToCart(itemIdsList)

    val bulkItems = mapOf("киви" to 2, "ананас" to 1, "яблоко" to 2)
    cart.addToCart(bulkItems)

    println(cart)

    val logger = Logger()

    println("=== ТЕСТИРОВАНИЕ ЛОГГЕРА ===")

    logger.log("Приложение успешно запущено.")

    logger.log(LogLevel.DEBUG, "Подключение к базе данных установлено.")
    logger.log(LogLevel.WARNING, "Низкий уровень заряда батареи или памяти!")
    logger.log(LogLevel.ERROR, "Не удалось сохранить файл на диск!")

    val batchMessages = listOf(
        "Загрузка конфигурации...",
        "Проверка обновлений...",
        "Синхронизация данных завершена."
    )
    println("\n--- Логирование списка сообщений ---")
    logger.log(batchMessages)

    println("\n--- Логирование ошибки (Exception) ---")
    try {
        val result = 10 / 0
    } catch (e: ArithmeticException) {
        logger.log(e)
    }
}