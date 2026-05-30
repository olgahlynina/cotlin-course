package ru.stimmax.lessons.lesson18.homeworks

class Kettle: TemperatureRegulateAbleEquipment() {

    private var isPowerOn = false
    private var waterAmount = 0

    override val maxTemperature: Int get() = 100

    // WaterContainer
    val capacity: Int get() = 2

    override fun powerOn() {
        isPowerOn = true
        println("Чайник включён")
    }

    override fun powerOff() {
        isPowerOn = false
        println("Чайник выключен")
    }

    fun fillWater(amount: Int) {
        val canAdd = minOf(amount, capacity - waterAmount)
        waterAmount += canAdd
        println("Добавлено $canAdd л воды. Итого: $waterAmount / $capacity л")
    }

    fun getWater(amount: Int) {
        val taken = minOf(amount, waterAmount)
        waterAmount -= taken
        println("Взято $taken л воды. Осталось: $waterAmount л")
    }

    override fun setTemperature(temp: Int) {
        if (!isPowerOn) {
            println("Ошибка: установка температуры невозможна — чайник выключен!")
            return
        }
        if (waterAmount == 0) {
            println("Ошибка: нет воды — налейте воду сначала!")
            return
        }
        super.setTemperature(temp)
        if (temp >= 100) println("Вода закипела!")
    }

    override fun programAction(action: String) {
        if (!isPowerOn) {
            println("Ошибка: задание режима работы невозможно — чайник выключен!")
            return
        }
        super.programAction(action)
    }

    override fun open() {
        println("Крышка чайника открыта")
    }

    override fun close() {
        println("Крышка чайника закрыта")
    }
}