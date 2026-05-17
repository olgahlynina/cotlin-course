package ru.stimmax.lessons.lesson14

import ru.stimmax.lessons.lesson14.homeworks.Concert
import ru.stimmax.lessons.lesson14.homeworks.Emotion
import ru.stimmax.lessons.lesson14.homeworks.Moon
import ru.stimmax.lessons.lesson14.homeworks.Party
import ru.stimmax.lessons.lesson14.homeworks.Product
import ru.stimmax.lessons.lesson14.homeworks.Rack
import ru.stimmax.lessons.lesson14.homeworks.Shelf

fun main() {

//1
    val birthdayParty = Party("Пони клуб", 50)
    birthdayParty.details()

//2
    val emotion = Emotion("Радость", 8)
    emotion.express()

//3
    Moon.showPhase()
    Moon.isVisible = false
    Moon.showPhase()

//4
    val chocolate = Product("Шоколад Аленка", 105.90, 1)
    val kefir = Product("Кефир 2,5%", 80.00, 2)

    val purchaseList = mutableListOf<Product>()
    purchaseList.add(chocolate)
    purchaseList.add(kefir)

    println("Ваша корзина:")
    purchaseList.forEach { println("- ${it.name}: ${it.quantity} шт. по ${it.price} руб.") }

//5
    val concert = Concert("Звери", "Концертный зал 'Дружба'", 7000.00, 1500)

    concert.showInfo()
    concert.ticketPurchase()

//6
    val rack = Rack(maxShelvesCount = 3)

    val shelf0 = Shelf(capacity = 15)
    val shelf1 = Shelf(capacity = 10)

    rack.addShelf(shelf0)
    rack.addShelf(shelf1)

    // Добавляем предметы
    rack.addItem("Книга")
    rack.addItem("Телевизор")
    rack.addItem("Ноутбук")

    rack.printContents()

    val leftOver = rack.advancedRemoveShelf(0)

    println("Предметы, которые не удалось спасти: $leftOver")
    rack.printContents()
}








