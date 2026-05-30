package ru.stimmax.lessons.lesson18.homeworks

class Oven : TemperatureRegulateAbleEquipment() {

    private var isPowerOn = false

    override val maxTemperature: Int get() = 250

    override fun powerOn() {
        isPowerOn = true
        println("Духовка включена")
    }

    override fun powerOff() {
        isPowerOn = false
        println("Духовка выключена")
    }

    override fun setTemperature(temp: Int) {
        if (!isPowerOn) {
            println("Ошибка: установка температуры невозможна — духовка выключена!")
            return
        }
        super.setTemperature(temp)
        if (temp > 200) println("Внимание! Высокая температура!")
    }

    override fun programAction(action: String) {
        if (!isPowerOn) {
            println("Ошибка: задание режима работы невозможно — духовка выключена!")
            return
        }
        super.programAction(action)
    }

    override fun open() {
        if (!isPowerOn) {
            println("Ошибка: нельзя открыть — духовка выключена!")
            return
        }
        println("Духовка открыта")
    }

    override fun close() {
        println("Духовка закрыта")
    }
}
