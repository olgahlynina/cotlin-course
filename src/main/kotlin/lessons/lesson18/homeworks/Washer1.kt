package ru.stimmax.lessons.lesson18.homeworks

class Washer1 : TemperatureRegulateAbleEquipment(), WaterConnection, Drainable, Timable, Cleanable {

    private var isPowerOn = false
    private var isDoorOpen = false

    override fun powerOn() {
        isPowerOn = true
        println("Стиральная машина включена")
    }

    override fun powerOff() {
        isPowerOn = false
        println("Стиральная машина выключена")
    }

    override val maxTemperature: Int get() = 95

    override fun setTemperature(temp: Int) {
        if (!isPowerOn) {
            println("Ошибка: установка температуры невозможна — стиральная машина выключена!")
            return
        }
        super.setTemperature(temp)
    }

    override fun programAction(action: String) {
        if (!isPowerOn) {
            println("Ошибка: задание режима работы невозможно — стиральная машина выключена!")
            return
        }
        super.programAction(action)
    }

    override fun open() {
        if (!isPowerOn) {
            println("Ошибка: нельзя открыть — стиральная машина выключена!")
            return
        }
        isDoorOpen = true
        println("Дверца стиральной машины открыта")
    }

    override fun close() {
        isDoorOpen = false
        println("Дверца стиральной машины закрыта")
    }

    override fun connectToWaterSupply() {
        println("Стиральная машина подключена к водопроводу")
    }

    override fun getWater(amount: Int) {
        println("Набрано $amount л воды")
    }

    override fun connectToDrain() {
        println("Стиральная машина подключена к сливу")
    }

    override fun drain() {
        println("Вода слита")
    }

    override fun setTimer(time: Int) {
        println("Таймер установлен на $time минут")
    }

    override fun clean() {
        println("Барабан стиральной машины очищен")
    }

    fun startWash() {
        if (!isPowerOn) {
            println("Ошибка: нельзя запустить стирку — машина выключена!")
            return
        }
        if (isDoorOpen) {
            println("Ошибка: закройте дверцу перед запуском стирки!")
            return
        }
        println("Стирка начата")
        println("Стирка завершена!")
    }
}