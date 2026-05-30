package ru.stimmax.lessons.lesson18.homeworks

//Задача 2. Создай абстрактный класс для включаемого оборудования и имплементируй соответствующий интерфейс с реализацией методов (достаточно println с выполняемым действием).
abstract class PowerableEquipment : Powerable {
    override fun powerOn() {
        println("Оборудование включено")
    }

    override fun powerOff() {
        println("Оборудование выключено")
    }
}
