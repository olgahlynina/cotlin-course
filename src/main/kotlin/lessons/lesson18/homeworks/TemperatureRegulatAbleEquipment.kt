package ru.stimmax.lessons.lesson18.homeworks

//Задача 4. Создай абстрактный класс оборудования с возможностью устанавливать температуру и открываться и с наследованием от программируемого оборудования. Также имплементируй интерфейсы.
abstract class TemperatureRegulateAbleEquipment :
    ProgrammableEquipment(), TemperatureRegulatable, Openable {

    private var currentTemperature = 20
    private var isOpen = false

    override val maxTemperature: Int get() = 100

    override fun setTemperature(temp: Int) {
        currentTemperature = when {
            temp > maxTemperature -> {
                println("Температура не может превышать $maxTemperature°C. Установлено $maxTemperature°C")
                maxTemperature
            }
            temp < 0 -> {
                println("Температура не может быть ниже 0°C. Установлено 0°C")
                0
            }
            else -> {
                println("Температура установлена на $temp°C")
                temp
            }
        }
    }

    override fun open() {
        if (!isOpen) {
            isOpen = true
            println("Оборудование открыто")
        } else {
            println("Оборудование уже открыто")
        }
    }

    override fun close() {
        if (isOpen) {
            isOpen = false
            println("Оборудование закрыто")
        } else {
            println("Оборудование уже закрыто")
        }
    }

    fun getCurrentTemperature(): Int = currentTemperature
    fun isOpened(): Boolean = isOpen
}
