package ru.stimmax.lessons.lesson18.homeworks

//Задача 5. Создай не абстрактные классы устройств с наследованием от абстрактного класса с возможностью устанавливать температуру и открываться. Пусть это будет холодильник, стиральная машина, чайник, духовка. Добавь недостающие интерфейсы и реализуй необходимые методы (достаточно вывод в консоль производимого действия). Обрати внимание на то, что установка температуры и программирование устройства (считай - задание режима работы) не имеет смысла при выключенном питании - добавь эту проверку.
class Fridge1 : TemperatureRegulateAbleEquipment() {

    private var isPowerOn = false

    override fun powerOn() {
        isPowerOn = true
        println("Холодильник включён")
    }

    override fun powerOff() {
        isPowerOn = false
        println("Холодильник выключен")
    }

    override val maxTemperature: Int get() = 10

    override fun setTemperature(temp: Int) {
        if (!isPowerOn) {
            println("Ошибка: установка температуры невозможна — холодильник выключен!")
            return
        }
        super.setTemperature(temp)
    }

    override fun programAction(action: String) {
        if (!isPowerOn) {
            println("Ошибка: задание режима работы невозможно — холодильник выключен!")
            return
        }
        super.programAction(action)
    }

    override fun open() {
        println("Дверца холодильника открыта")
    }

    override fun close() {
        println("Дверца холодильника закрыта")
    }
}
